package br.com.costalavos.model.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public class InformacoesAdicionais {

  @JsonProperty("codProj")
  private BigInteger codigoProjeto;

  private String codigoInt;

  private String nome;

  private String inativo;

  public BigInteger getCodigoProjeto() {
    return codigoProjeto;
  }

  public void setCodigoProjeto(BigInteger codigoProjeto) {
    this.codigoProjeto = codigoProjeto;
  }

  public String getCodigoInt() {
    return codigoInt;
  }

  public void setCodigoInt(String codigoInt) {
    this.codigoInt = codigoInt;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getInativo() {
    return inativo;
  }

  public void setInativo(String inativo) {
    this.inativo = inativo;
  }
}
