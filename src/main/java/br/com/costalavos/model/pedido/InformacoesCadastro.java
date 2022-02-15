package br.com.costalavos.model.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InformacoesCadastro {

  @JsonProperty("dInc")
  private String dataInclusao;

  public String getDataInclusao() {
    return dataInclusao;
  }

  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }
}
