package br.com.costalavos.model.pedido;

import br.com.costalavos.model.paginacao.PaginacaoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PedidoVendaProdutoLista extends PaginacaoResponse {

    @JsonProperty("pedido_venda_produto")
    private ArrayList<PedidoResponse> pedidoVendaProduto;

    public ArrayList<PedidoResponse> getPedidoVendaProduto() {
        return pedidoVendaProduto;
    }
    public void setPedidoVendaProduto(ArrayList<PedidoResponse> pedidoVendaProduto) {
        this.pedidoVendaProduto = pedidoVendaProduto;
    }
}
