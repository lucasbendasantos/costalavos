package br.com.costalavos.model.projeto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public class Projeto {

  @JsonProperty("codigo")
  private BigInteger codigo;

  @JsonProperty("codInt")
  private String codigoInt;

  @JsonProperty("nome")
  private String nome;

  @JsonProperty("inativo")
  private String inativo;

  public BigInteger getCodigo() {
    return codigo;
  }

  public void setCodigo(BigInteger codigo) {
    this.codigo = codigo;
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
