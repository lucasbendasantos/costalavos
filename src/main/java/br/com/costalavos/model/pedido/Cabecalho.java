package br.com.costalavos.model.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public class Cabecalho {

    private char bloqueado;

    @JsonProperty("codigo_cenario_impostos")
    private String codigoCenarioImpostos;

    @JsonProperty("codigo_cliente")
    private BigInteger codigoCliente;

    @JsonProperty("codigo_empresa")
    private BigInteger codigoEmpresa;

    @JsonProperty("codigo_parcela")
    private String codigoParcela;

    @JsonProperty("codigo_pedido")
    private BigInteger codigoPedido;

    @JsonProperty("codigo_pedido_integracao")
    private BigInteger codigoPedidoIntegracao;

    @JsonProperty("data_previsao")
    private String dataPrevisao;

    private String etapa;

    @JsonProperty("importado_api")
    private String importadoApi;

    @JsonProperty("numero_pedido")
    private String numeroPedido;

    @JsonProperty("origem_pedido")
    private String origemPedido;

    @JsonProperty("qtde_parcelas")
    private int quantidadeParcelas;

    @JsonProperty("quantidade_itens")
    private int quantidadeItens;

    public char getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(char bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String getCodigoCenarioImpostos() {
        return codigoCenarioImpostos;
    }

    public void setCodigoCenarioImpostos(String codigoCenarioImpostos) {
        this.codigoCenarioImpostos = codigoCenarioImpostos;
    }

    public BigInteger getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(BigInteger codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public BigInteger getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(BigInteger codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getCodigoParcela() {
        return codigoParcela;
    }

    public void setCodigoParcela(String codigoParcela) {
        this.codigoParcela = codigoParcela;
    }

    public BigInteger getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(BigInteger codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public BigInteger getCodigoPedidoIntegracao() {
        return codigoPedidoIntegracao;
    }

    public void setCodigoPedidoIntegracao(BigInteger codigoPedidoIntegracao) {
        this.codigoPedidoIntegracao = codigoPedidoIntegracao;
    }

    public String getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(String dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getImportadoApi() {
        return importadoApi;
    }

    public void setImportadoApi(String importadoApi) {
        this.importadoApi = importadoApi;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getOrigemPedido() {
        return origemPedido;
    }

    public void setOrigemPedido(String origemPedido) {
        this.origemPedido = origemPedido;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
}
