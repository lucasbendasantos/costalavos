package br.com.costalavos.service;

import br.com.costalavos.model.cliente.Cliente;
import br.com.costalavos.model.cliente.ClientesCadastroResumido;
import br.com.costalavos.model.lancamentos.ResumoList;
import br.com.costalavos.model.lancamentos.TitulosEncontrados;
import br.com.costalavos.model.pedido.*;
import br.com.costalavos.model.projeto.Projeto;
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

  @Autowired
  ProjetoService projetoService;

  public PedidoVendaProdutoLista listarTodos(PedidoRequest pedidoRequest) {
    try {
      ClientesCadastroResumido clientesCadastroResumido = clienteService.consultarClienteResumido(pedidoRequest.getNome_fantasia());

      HashMap<String, Object> params = new HashMap<>();
      params.put("pagina", pedidoRequest.getPagina());
      params.put("registros_por_pagina", pedidoRequest.getRegistros_por_pagina());
      params.put("apenas_importado_api", pedidoRequest.getApenas_importado_api());

      if (!isEmptyOrNull(pedidoRequest.getNumero_pedido_de())) {
        params.put("numero_pedido_de", pedidoRequest.getNumero_pedido_de());
      }

      if (!isEmptyOrNull(pedidoRequest.getNumero_pedido_ate())) {
        params.put("numero_pedido_ate", pedidoRequest.getNumero_pedido_ate());
      }

      if (!isEmptyOrNull(pedidoRequest.getNome_fantasia())) {
        if (clientesCadastroResumido != null) {
          if (clientesCadastroResumido.getClientesCadastroResumido().get(0).getNomeFantasia().toUpperCase().contains(pedidoRequest.getNome_fantasia().toUpperCase())) {
            params.put("filtrar_por_cliente", clientesCadastroResumido.getClientesCadastroResumido().get(0).getCodigoCliente());
          }
        }
      }


      PedidoVendaProdutoLista listaPedido = (PedidoVendaProdutoLista) httpClient.post("/produtos/pedido/", params, "ListarPedidos", PedidoVendaProdutoLista.class).getBody();
      return incluirClienteListaPedido(listaPedido);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return new PedidoVendaProdutoLista();
    }
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

      InformacoesAdicionais informacoesAdicionais = new InformacoesAdicionais();

      //Verificação necessária pois alguns projetos estam vindo com codigo 0
      if(pedido.getInformacoesAdicionais().getCodigoProjeto() != BigInteger.valueOf(0)){
        Projeto projeto = projetoService.buscarProjetoByCodigo(pedido.getInformacoesAdicionais().getCodigoProjeto());
        informacoesAdicionais.setInativo(projeto.getInativo());
        informacoesAdicionais.setCodigoInt(projeto.getCodigoInt());
        informacoesAdicionais.setCodigoProjeto(projeto.getCodigo());
        informacoesAdicionais.setNome(projeto.getNome());
      }

      pedido.setInformacoesAdicionais(informacoesAdicionais);

      lista.add(pedido);
    }
    PedidoVendaProdutoLista novoPedidoVendaProdutoLista = new PedidoVendaProdutoLista();
    novoPedidoVendaProdutoLista.setPedidoVendaProduto(lista);
    novoPedidoVendaProdutoLista.setNumeroPagina(pedidoVendaProdutoLista.getNumeroPagina());
    novoPedidoVendaProdutoLista.setNumeroRegistros(pedidoVendaProdutoLista.getNumeroRegistros());
    novoPedidoVendaProdutoLista.setNumeroTotalPaginas(pedidoVendaProdutoLista.getNumeroTotalPaginas());
    novoPedidoVendaProdutoLista.setNumeroTotalRegistros(pedidoVendaProdutoLista.getNumeroTotalRegistros());
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

  private boolean isEmptyOrNull(String str) {
    if (str != null) {
      if (!str.isEmpty() || str.length() != 0 || !str.equalsIgnoreCase("")) {
        return false;
      }
      return true;
    }
    return true;
  }

}
