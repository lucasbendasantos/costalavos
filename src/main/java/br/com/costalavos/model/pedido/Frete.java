package br.com.costalavos.model.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Frete {

    @JsonProperty("codigo_rastreio")
    private String codigoRastreio;

    @JsonProperty("codigo_tipo_entrega")
    private int codigoTipoEntrega;

    @JsonProperty("codigo_transportadora")
    private int codigoTransportadora;

    @JsonProperty("especie_volumes")
    private String especieVolumes;

    @JsonProperty("marca_volumes")
    private String marcaVolumes;

    @JsonProperty("modalidade")
    private String modalidade;

    @JsonProperty("numeracao_volumes")
    private String numeracaoVolumes;

    @JsonProperty("numero_lacre")
    private String numeroLacre;

    @JsonProperty("outras_despesas")
    private double outrasDespesas;

    @JsonProperty("peso_bruto")
    private double pesoBruto;

    @JsonProperty("peso_liquido")
    private double pesoLiquido;

    @JsonProperty("placa")
    private String placa;

    @JsonProperty("placa_estado")
    private String placaEstrada;

    @JsonProperty("previsao_entrega")
    private String previsaoEntrega;

    @JsonProperty("quantidade_volumes")
    private int quantidadeVolumes;

    @JsonProperty("registro_transportador")
    private String registroTransportador;

    @JsonProperty("valor_frete")
    private double valorFrete;

    @JsonProperty("valor_seguro")
    private double valorSeguro;

    @JsonProperty("veiculo_proprio")
    private String veiculoProprio;

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public void setCodigoRastreio(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    public int getCodigoTipoEntrega() {
        return codigoTipoEntrega;
    }

    public void setCodigoTipoEntrega(int codigoTipoEntrega) {
        this.codigoTipoEntrega = codigoTipoEntrega;
    }

    public int getCodigoTransportadora() {
        return codigoTransportadora;
    }

    public void setCodigoTransportadora(int codigoTransportadora) {
        this.codigoTransportadora = codigoTransportadora;
    }

    public String getEspecieVolumes() {
        return especieVolumes;
    }

    public void setEspecieVolumes(String especieVolumes) {
        this.especieVolumes = especieVolumes;
    }

    public String getMarcaVolumes() {
        return marcaVolumes;
    }

    public void setMarcaVolumes(String marcaVolumes) {
        this.marcaVolumes = marcaVolumes;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNumeracaoVolumes() {
        return numeracaoVolumes;
    }

    public void setNumeracaoVolumes(String numeracaoVolumes) {
        this.numeracaoVolumes = numeracaoVolumes;
    }

    public String getNumeroLacre() {
        return numeroLacre;
    }

    public void setNumeroLacre(String numeroLacre) {
        this.numeroLacre = numeroLacre;
    }

    public double getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlacaEstrada() {
        return placaEstrada;
    }

    public void setPlacaEstrada(String placaEstrada) {
        this.placaEstrada = placaEstrada;
    }

    public String getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(String previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public int getQuantidadeVolumes() {
        return quantidadeVolumes;
    }

    public void setQuantidadeVolumes(int quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
    }

    public String getRegistroTransportador() {
        return registroTransportador;
    }

    public void setRegistroTransportador(String registroTransportador) {
        this.registroTransportador = registroTransportador;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public String getVeiculoProprio() {
        return veiculoProprio;
    }

    public void setVeiculoProprio(String veiculoProprio) {
        this.veiculoProprio = veiculoProprio;
    }
}
