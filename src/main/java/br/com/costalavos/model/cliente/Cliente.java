package br.com.costalavos.model.cliente;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cliente {

    @JsonProperty("codigo_cliente_omie")
    private int codigoClienteOmie;

    @JsonProperty("razao_social")
    private String razaoSocial;

    @JsonProperty("cnpj_cpf")
    private String cnpjCpf;

    @JsonProperty("nome_fantasia")
    private String nomeFantasia;

    @JsonProperty("telefone1_ddd")
    private String telefoneDDD;

    @JsonProperty("telefone1_numero")
    private String telefone;

    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("endereco_numero")
    private String enderecoNumero;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("estado")
    private String estado;

    @JsonProperty("cidade")
    private String cidade;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("email")
    private String email;

    @JsonProperty("inscricao_estadual")
    private String inscricaoEstadual;

    public int getCodigoClienteOmie() {
        return codigoClienteOmie;
    }

    public void setCodigoClienteOmie(int codigoClienteOmie) {
        this.codigoClienteOmie = codigoClienteOmie;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefoneDDD() {
        return telefoneDDD;
    }

    public void setTelefoneDDD(String telefoneDDD) {
        this.telefoneDDD = telefoneDDD;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}
