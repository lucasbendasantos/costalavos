package br.com.costalavos.model.produto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public class Produto {

    private String cfop;

    @JsonProperty("cnpj_fabricante")
    private String cnpjFabricante;

    private String codigo;

    @JsonProperty("codigo_produto")
    private BigInteger codigoProduto;

    @JsonProperty("codigo_tabela_preco")
    private BigInteger codigoTabelaPreco;

    private String descricao;
    private String ean;

    @JsonProperty("indicador_escala")
    private String indicadorEscala;

    @JsonProperty("motivo_icms_desonerado")
    private String motivoIcmsDesonerado;

    private String ncm;

    @JsonProperty("percentual_desconto")
    private int percentualDesconto;

    private int quantidade;
    private String reservado;

    @JsonProperty("tipo_desconto")
    private String tipoDesconto;

    private String unidade;

    @JsonProperty("valor_deducao")
    private double valorDeducao;

    @JsonProperty("valor_desconto")
    private double valorDesconto;

    @JsonProperty("valor_icms_desonerado")
    private double valorIcmsDesonerado;

    @JsonProperty("valor_mercadoria")
    private  double valorMercadoria;

    @JsonProperty("valor_total")
    private double valorTotal;

    @JsonProperty("valor_unitario")
    private double valorUnitario;


    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getCnpjFabricante() {
        return cnpjFabricante;
    }

    public void setCnpjFabricante(String cnpjFabricante) {
        this.cnpjFabricante = cnpjFabricante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigInteger getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(BigInteger codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public BigInteger getCodigoTabelaPreco() {
        return codigoTabelaPreco;
    }

    public void setCodigoTabelaPreco(BigInteger codigoTabelaPreco) {
        this.codigoTabelaPreco = codigoTabelaPreco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getIndicadorEscala() {
        return indicadorEscala;
    }

    public void setIndicadorEscala(String indicadorEscala) {
        this.indicadorEscala = indicadorEscala;
    }

    public String getMotivoIcmsDesonerado() {
        return motivoIcmsDesonerado;
    }

    public void setMotivoIcmsDesonerado(String motivoIcmsDesonerado) {
        this.motivoIcmsDesonerado = motivoIcmsDesonerado;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public int getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getReservado() {
        return reservado;
    }

    public void setReservado(String reservado) {
        this.reservado = reservado;
    }

    public String getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(String tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getValorDeducao() {
        return valorDeducao;
    }

    public void setValorDeducao(double valorDeducao) {
        this.valorDeducao = valorDeducao;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorIcmsDesonerado() {
        return valorIcmsDesonerado;
    }

    public void setValorIcmsDesonerado(double valorIcmsDesonerado) {
        this.valorIcmsDesonerado = valorIcmsDesonerado;
    }

    public double getValorMercadoria() {
        return valorMercadoria;
    }

    public void setValorMercadoria(double valorMercadoria) {
        this.valorMercadoria = valorMercadoria;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
