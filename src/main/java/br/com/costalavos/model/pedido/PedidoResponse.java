package br.com.costalavos.model.pedido;

public class PedidoResponse {

    private Cabecalho cabecalho;
    private TotalPedido totalPedido;

    public Cabecalho getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(Cabecalho cabecalho) {
        this.cabecalho = cabecalho;
    }

    public TotalPedido getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(TotalPedido totalPedido) {
        this.totalPedido = totalPedido;
    }
}
