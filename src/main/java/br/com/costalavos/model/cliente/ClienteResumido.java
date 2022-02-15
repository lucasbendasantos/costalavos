package br.com.costalavos.model.cliente;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public class ClienteResumido {

  @JsonProperty("cnpj_cpf")
  private String cnpjCpf;

  @JsonProperty("codigo_cliente")
  private BigInteger codigoCliente;

  @JsonProperty("codigo_cliente_integracao")
  private String codigoClienteintegracao;

  @JsonProperty("nome_fantasia")
  private String nomeFantasia;

  @JsonProperty("razao_social")
  private String razaoSocial;

  public String getCnpjCpf() {
    return cnpjCpf;
  }

  public void setCnpjCpf(String cnpjCpf) {
    this.cnpjCpf = cnpjCpf;
  }

  public BigInteger getCodigoCliente() {
    return codigoCliente;
  }

  public void setCodigoCliente(BigInteger codigoCliente) {
    this.codigoCliente = codigoCliente;
  }

  public String getCodigoClienteintegracao() {
    return codigoClienteintegracao;
  }

  public void setCodigoClienteintegracao(String codigoClienteintegracao) {
    this.codigoClienteintegracao = codigoClienteintegracao;
  }

  public String getNomeFantasia() {
    return nomeFantasia;
  }

  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  public String getRazaoSocial() {
    return razaoSocial;
  }

  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }
}
