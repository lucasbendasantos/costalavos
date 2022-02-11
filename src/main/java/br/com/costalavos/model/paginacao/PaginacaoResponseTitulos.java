package br.com.costalavos.model.paginacao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginacaoResponseTitulos {

  @JsonProperty("nPagina")
  private int numeroPagina;

  @JsonProperty("nTotPaginas")
  private int numeroTotalPaginas;

  @JsonProperty("nRegistros")
  private int numeroRegistros;

  @JsonProperty("nTotRegistros")
  private int numeroTotalRegistros;

  public int getNumeroPagina() {
    return numeroPagina;
  }

  public void setNumeroPagina(int numeroPagina) {
    this.numeroPagina = numeroPagina;
  }

  public int getNumeroTotalPaginas() {
    return numeroTotalPaginas;
  }

  public void setNumeroTotalPaginas(int numeroTotalPaginas) {
    this.numeroTotalPaginas = numeroTotalPaginas;
  }

  public int getNumeroRegistros() {
    return numeroRegistros;
  }

  public void setNumeroRegistros(int numeroRegistros) {
    this.numeroRegistros = numeroRegistros;
  }

  public int getNumeroTotalRegistros() {
    return numeroTotalRegistros;
  }

  public void setNumeroTotalRegistros(int numeroTotalRegistros) {
    this.numeroTotalRegistros = numeroTotalRegistros;
  }
}
