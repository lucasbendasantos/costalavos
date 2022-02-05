package br.com.costalavos.model.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalPedido {

    @JsonProperty("valor_descontos")
    private double valorDescontos;

    @JsonProperty("valor_mercadorias")
    private double valorMercadorias;

    @JsonProperty("valor_total_pedido")
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
