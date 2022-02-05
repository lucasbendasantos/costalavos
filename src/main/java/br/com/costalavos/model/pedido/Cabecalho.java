package br.com.costalavos.model.pedido;

public class Cabecalho {

    private char bloqueado;
    private String codigoCenarioImpostos;
    private int codigoCliente;
    private int codigoEmpresa;
    private String parcela;
    private int codigoPedido;
    private int codigoPedidoIntegracao;
    private String dataPrevisao;
    private String etapa;
    private String importadoApi;
    private String numeroPedido;
    private String origemProduto;
    private int quantidadeParcelas;
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

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getCodigoPedidoIntegracao() {
        return codigoPedidoIntegracao;
    }

    public void setCodigoPedidoIntegracao(int codigoPedidoIntegracao) {
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

    public String getOrigemProduto() {
        return origemProduto;
    }

    public void setOrigemProduto(String origemProduto) {
        this.origemProduto = origemProduto;
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
