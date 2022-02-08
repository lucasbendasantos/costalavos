package br.com.costalavos.model.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalPedido {

  @JsonProperty("valor_descontos")
  private double valorDescontos;

  @JsonProperty("valor_mercadorias")
  private double valorMercadorias;

  @JsonProperty("valor_total_pedido")
  private double valorTotalPedido;

  @JsonProperty("valor_aberto")
  private double valorAberto;

  @JsonProperty("valor_total_cliente")
  private double valorTotalCliente;

  public double getValorAberto() {
    return valorAberto;
  }

  public void setValorAberto(double valorAberto) {
    this.valorAberto = valorAberto;
  }

  public double getValorTotalCliente() {
    return valorTotalCliente;
  }

  public void setValorTotalCliente(double valorTotalCliente) {
    this.valorTotalCliente = valorTotalCliente;
  }

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
