package br.com.costalavos.model.lancamentos;

import br.com.costalavos.model.paginacao.PaginacaoResponseTitulos;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class TitulosEncontrados extends PaginacaoResponseTitulos {

  @JsonProperty("titulosEncontrados")
  private ArrayList<ResumoList> titulosEncontrados;

  public ArrayList<ResumoList> getTitulosEncontrados() {
    return titulosEncontrados;
  }

  public void setTitulosEncontrados(ArrayList<ResumoList> titulosEncontrados) {
    this.titulosEncontrados = titulosEncontrados;
  }
}
