package br.com.costalavos.model.pedido;

import br.com.costalavos.model.paginacao.Paginacao;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PedidoRequest extends Paginacao {

  @JsonProperty("numero_pedido_de")
  private String numero_pedido_de;

  @JsonProperty("numero_pedido_ate")
  private String numero_pedido_ate;

  @JsonProperty("nome_fantasia")
  private String nome_fantasia;

  public String getNumero_pedido_de() {
    return numero_pedido_de;
  }

  public void setNumero_pedido_de(String numero_pedido_de) {
    this.numero_pedido_de = numero_pedido_de;
  }

  public String getNumero_pedido_ate() {
    return numero_pedido_ate;
  }

  public void setNumero_pedido_ate(String numero_pedido_ate) {
    this.numero_pedido_ate = numero_pedido_ate;
  }

  public String getNome_fantasia() {
    return nome_fantasia;
  }

  public void setNome_fantasia(String nome_fantasia) {
    this.nome_fantasia = nome_fantasia;
  }
}
