package br.com.costalavos.model.lancamentos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResumoList {

  @JsonProperty("resumo")
  private ResumoLancamento resumo;

  public ResumoLancamento getResumo() {
    return resumo;
  }

  public void setResumo(ResumoLancamento resumo) {
    this.resumo = resumo;
  }
}
