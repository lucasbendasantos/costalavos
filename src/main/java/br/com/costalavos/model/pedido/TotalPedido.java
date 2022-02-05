package br.com.costalavos.model.pedido;

public class TotalPedido {

    private double valorDescontos;
    private double valorMercadorias;
    private double valorTotalPedido;

    public double getValorDescontos() {
        return valorDescontos;
    }

    public void setValorDescontos(double valorDescontos) {
        this.valorDescontos = valorDescontos;
    }

    public double getValorMercadorias() {
        return valorMercadorias;
    }

    public void setValorMercadorias(double valorMercadorias) {
        this.valorMercadorias = valorMercadorias;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }
}
