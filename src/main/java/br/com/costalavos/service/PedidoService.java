package br.com.costalavos.service;

import br.com.costalavos.model.cliente.Cliente;
import br.com.costalavos.model.paginacao.Paginacao;
import br.com.costalavos.model.pedido.PedidoResponse;
import br.com.costalavos.model.pedido.PedidoVendaProduto;
import br.com.costalavos.model.pedido.PedidoVendaProdutoLista;
import br.com.costalavos.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PedidoService {

    @Autowired
    HttpClient httpClient;

    @Autowired
    ClienteService clienteService;

    public PedidoVendaProdutoLista listarTodos(Paginacao paginacao){
        return (PedidoVendaProdutoLista) httpClient.post("/produtos/pedido/", paginacao, "ListarPedidos", PedidoVendaProdutoLista.class).getBody();
    }

    public PedidoVendaProduto consultarPedido(int codigoPedido){
        HashMap<String, Integer> request = new HashMap<String, Integer>();
        request.put("codigo_pedido", codigoPedido);

        PedidoVendaProduto pedido = (PedidoVendaProduto) httpClient.post("/produtos/pedido/", request, "ConsultarPedido", PedidoVendaProduto.class).getBody();

        Cliente cliente = clienteService.consultarCliente(pedido.getPedidoResponse().getCabecalho().getCodigoCliente());

        pedido.setCliente(cliente);

        return pedido;

    }

}
