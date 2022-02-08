package br.com.costalavos.model.lancamentos;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ResumoLancamento {

  @JsonProperty("cLiquidado")
  private String contratoLiquidado;

  @JsonProperty("nDesconto")
  private double numeroDesconto;

  @JsonProperty("nJuros")
  private double numeroJuros;

  @JsonProperty("nMulta")
  private double numeroMulta;

  @JsonProperty("nValAberto")
  private double numeroValorAberto;

  @JsonProperty("nValLiquido")
  private double numeroValorLiquido;

  @JsonProperty("nValPago")
  private double numeroValorPago;

  public String getContratoLiquidado() {
    return contratoLiquidado;
  }

  public void setContratoLiquidado(String contratoLiquidado) {
    this.contratoLiquidado = contratoLiquidado;
  }

  public double getNumeroDesconto() {
    return numeroDesconto;
  }

  public void setNumeroDesconto(double numeroDesconto) {
    this.numeroDesconto = numeroDesconto;
  }

  public double getNumeroJuros() {
    return numeroJuros;
  }

  public void setNumeroJuros(double numeroJuros) {
    this.numeroJuros = numeroJuros;
  }

  public double getNumeroMulta() {
    return numeroMulta;
  }

  public void setNumeroMulta(double numeroMulta) {
    this.numeroMulta = numeroMulta;
  }

  public double getNumeroValorAberto() {
    return numeroValorAberto;
  }

  public void setNumeroValorAberto(double numeroValorAberto) {
    this.numeroValorAberto = numeroValorAberto;
  }

  public double getNumeroValorLiquido() {
    return numeroValorLiquido;
  }

  public void setNumeroValorLiquido(double numeroValorLiquido) {
    this.numeroValorLiquido = numeroValorLiquido;
  }

  public double getNumeroValorPago() {
    return numeroValorPago;
  }

  public void setNumeroValorPago(double numeroValorPago) {
    this.numeroValorPago = numeroValorPago;
  }
}
