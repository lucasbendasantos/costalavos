package br.com.costalavos.model.paginacao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginacaoResponse {

  @JsonProperty("pagina")
  private int numeroPagina;

  @JsonProperty("total_de_paginas")
  private int numeroTotalPaginas;

  @JsonProperty("registros")
  private int numeroRegistros;

  @JsonProperty("total_de_registros")
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
