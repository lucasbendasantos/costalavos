package br.com.costalavos.model.pedido;

import br.com.costalavos.model.cliente.Cliente;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PedidoVendaProduto {

    @JsonProperty("pedido_venda_produto")
    private PedidoResponse pedidoResponse;

    public PedidoResponse getPedidoResponse() {
        return pedidoResponse;
    }

    public void setPedidoResponse(PedidoResponse pedidoResponse) {
        this.pedidoResponse = pedidoResponse;
    }
}
