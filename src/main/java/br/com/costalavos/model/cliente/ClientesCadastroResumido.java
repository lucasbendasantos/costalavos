package br.com.costalavos.model.cliente;

import br.com.costalavos.model.paginacao.Paginacao;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ClientesCadastroResumido  extends Paginacao {

  @JsonProperty("clientes_cadastro_resumido")
  private List<ClienteResumido> clientesCadastroResumido;

  public List<ClienteResumido> getClientesCadastroResumido() {
    return clientesCadastroResumido;
  }

  public void setClientesCadastroResumido(List<ClienteResumido> clientesCadastroResumido) {
    this.clientesCadastroResumido = clientesCadastroResumido;
  }
}
