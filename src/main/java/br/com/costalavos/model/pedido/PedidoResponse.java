package br.com.costalavos.model.pedido;

import br.com.costalavos.model.cliente.Cliente;
import br.com.costalavos.model.produto.Det;
import br.com.costalavos.model.produto.Produto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PedidoResponse {

  @JsonProperty("cabecalho")
  private Cabecalho cabecalho;

  @JsonProperty("total_pedido")
  private TotalPedido totalPedido;

  @JsonProperty("det")
  private ArrayList<Det> det;

  @JsonProperty("frete")
  private Frete frete;

  @JsonProperty("cliente")
  private Cliente cliente;

  @JsonProperty("infoCadastro")
  private InformacoesCadastro informacoesCadastro;

  @JsonProperty("informacoes_adicionais")
  private InformacoesAdicionais informacoesAdicionais;

  public Cabecalho getCabecalho() {
    return cabecalho;
  }

  public void setCabecalho(Cabecalho cabecalho) {
    this.cabecalho = cabecalho;
  }

  public TotalPedido getTotalPedido() {
    return totalPedido;
  }

  public void setTotalPedido(TotalPedido totalPedido) {
    this.totalPedido = totalPedido;
  }

  public ArrayList<Det> getDet() {
    return det;
  }

  public void setDet(ArrayList<Det> det) {
    this.det = det;
  }

  public Frete getFrete() {
    return frete;
  }

  public void setFrete(Frete frete) {
    this.frete = frete;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public InformacoesCadastro getInformacoesCadastro() {
    return informacoesCadastro;
  }

  public void setInformacoesCadastro(InformacoesCadastro informacoesCadastro) {
    this.informacoesCadastro = informacoesCadastro;
  }

  public InformacoesAdicionais getInformacoesAdicionais() {
    return informacoesAdicionais;
  }

  public void setInformacoesAdicionais(InformacoesAdicionais informacoesAdicionais) {
    this.informacoesAdicionais = informacoesAdicionais;
  }
}
