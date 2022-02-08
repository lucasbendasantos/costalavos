package br.com.costalavos.service;

import br.com.costalavos.model.cliente.Cliente;
import br.com.costalavos.model.paginacao.Paginacao;
import br.com.costalavos.model.pedido.PedidoResponse;
import br.com.costalavos.model.pedido.PedidoVendaProduto;
import br.com.costalavos.model.pedido.PedidoVendaProdutoLista;
import br.com.costalavos.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PedidoService {

    @Autowired
    HttpClient httpClient;

    @Autowired
    ClienteService clienteService;

    public PedidoVendaProdutoLista listarTodos(Paginacao paginacao){
        PedidoVendaProdutoLista listaPedido = (PedidoVendaProdutoLista) httpClient.post("/produtos/pedido/", paginacao, "ListarPedidos", PedidoVendaProdutoLista.class).getBody();
        return incluirClienteListaPedido(listaPedido);
    }

    public PedidoVendaProduto consultarPedido(BigInteger numeroPedido){
        HashMap<String, BigInteger> request = new HashMap<String, BigInteger>();
        request.put("numero_pedido", numeroPedido);

        PedidoVendaProduto pedido = (PedidoVendaProduto) httpClient.post("/produtos/pedido/", request, "ConsultarPedido", PedidoVendaProduto.class).getBody();

        Cliente cliente = buscarCliente(pedido.getPedidoResponse().getCabecalho().getCodigoCliente());
        PedidoResponse pedidoResponse = pedido.getPedidoResponse();
        pedidoResponse.setCliente(cliente);
        pedido.setPedidoResponse(pedidoResponse);
        return pedido;

    }

    private Cliente buscarCliente(BigInteger iDCliente){
        return clienteService.consultarCliente(iDCliente);
    }

    private PedidoVendaProdutoLista incluirClienteListaPedido(PedidoVendaProdutoLista pedidoVendaProdutoLista){
        ArrayList<PedidoResponse> lista = new ArrayList<>();
        for(PedidoResponse pedido : pedidoVendaProdutoLista.getPedidoVendaProduto()){
            pedido.setCliente(buscarCliente(pedido.getCabecalho().getCodigoCliente()));
            lista.add(pedido);
        }
        PedidoVendaProdutoLista novoPedidoVendaProdutoLista = new PedidoVendaProdutoLista();
        novoPedidoVendaProdutoLista.setPedidoVendaProduto(lista);
        return novoPedidoVendaProdutoLista;
    }

}
