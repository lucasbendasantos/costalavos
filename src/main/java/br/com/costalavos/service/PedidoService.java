package br.com.costalavos.service;

import br.com.costalavos.model.cliente.Cliente;
import br.com.costalavos.model.lancamentos.ResumoLancamento;
import br.com.costalavos.model.lancamentos.ResumoList;
import br.com.costalavos.model.lancamentos.TitulosEncontrados;
import br.com.costalavos.model.paginacao.Paginacao;
import br.com.costalavos.model.pedido.PedidoResponse;
import br.com.costalavos.model.pedido.PedidoVendaProduto;
import br.com.costalavos.model.pedido.PedidoVendaProdutoLista;
import br.com.costalavos.model.pedido.TotalPedido;
import br.com.costalavos.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PedidoService {

  @Autowired
  HttpClient httpClient;

  @Autowired
  ClienteService clienteService;

  @Autowired
  LancamentosService lancamentosService;

  public PedidoVendaProdutoLista listarTodos(Paginacao paginacao) {
    PedidoVendaProdutoLista listaPedido = (PedidoVendaProdutoLista) httpClient.post("/produtos/pedido/", paginacao, "ListarPedidos", PedidoVendaProdutoLista.class).getBody();
    return incluirClienteListaPedido(listaPedido);
  }

  public PedidoVendaProduto consultarPedido(BigInteger numeroPedido) {
    HashMap<String, BigInteger> request = new HashMap<String, BigInteger>();
    request.put("numero_pedido", numeroPedido);

    PedidoVendaProduto pedido = (PedidoVendaProduto) httpClient.post("/produtos/pedido/", request, "ConsultarPedido", PedidoVendaProduto.class).getBody();

    Cliente cliente = buscarCliente(pedido.getPedidoResponse().getCabecalho().getCodigoCliente());

    TitulosEncontrados titulosEncontrados = lancamentosService.buscarLancamentosPorCNPJ(cliente.getCnpjCpf());

    TotalPedido totalPedido = geraTotalPedidoCliente(pedido.getPedidoResponse().getTotalPedido(), titulosEncontrados);


    PedidoResponse pedidoResponse = pedido.getPedidoResponse();
    pedidoResponse.setTotalPedido(totalPedido);
    pedidoResponse.setCliente(cliente);
    pedido.setPedidoResponse(pedidoResponse);
    return pedido;

  }

  private Cliente buscarCliente(BigInteger iDCliente) {
    return clienteService.consultarCliente(iDCliente);
  }

  private PedidoVendaProdutoLista incluirClienteListaPedido(PedidoVendaProdutoLista pedidoVendaProdutoLista) {
    ArrayList<PedidoResponse> lista = new ArrayList<>();
    for (PedidoResponse pedido : pedidoVendaProdutoLista.getPedidoVendaProduto()) {
      pedido.setCliente(buscarCliente(pedido.getCabecalho().getCodigoCliente()));

      TitulosEncontrados titulosEncontrados = lancamentosService.buscarLancamentosPorCNPJ(pedido.getCliente().getCnpjCpf());

      TotalPedido totalPedido = geraTotalPedidoCliente(pedido.getTotalPedido(), titulosEncontrados);
      pedido.setTotalPedido(totalPedido);
      lista.add(pedido);
    }
    PedidoVendaProdutoLista novoPedidoVendaProdutoLista = new PedidoVendaProdutoLista();
    novoPedidoVendaProdutoLista.setPedidoVendaProduto(lista);
    return novoPedidoVendaProdutoLista;
  }

  private TotalPedido geraTotalPedidoCliente(TotalPedido totalPedido, TitulosEncontrados titulosEncontrados) {
    double valorAberto = 0.0;
    double valorTotalCliente = 0.0;

    for (ResumoList resumo : titulosEncontrados.getTitulosEncontrados()) {
      valorAberto += resumo.getResumo().getNumeroValorAberto();
    }

    valorTotalCliente = valorAberto + totalPedido.getValorTotalPedido();
    DecimalFormat df = new DecimalFormat("#.##");
     totalPedido.setValorTotalCliente(Double.valueOf(df.format(valorTotalCliente).replaceAll(",", ".")));
    totalPedido.setValorAberto(Double.valueOf(df.format(valorAberto).replaceAll(",", ".")));
    return totalPedido;
  }

}
