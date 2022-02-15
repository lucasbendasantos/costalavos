package br.com.costalavos.service;

import br.com.costalavos.model.cliente.Cliente;
import br.com.costalavos.model.cliente.ClientesCadastroResumido;
import br.com.costalavos.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.HashMap;

@Service
public class ClienteService {

  @Autowired
  HttpClient httpClient;

  public Cliente consultarCliente(BigInteger codigoClienteOmie) {
    HashMap<String, BigInteger> request = new HashMap<>();
    request.put("codigo_cliente_omie", codigoClienteOmie);
    return (Cliente) httpClient.post("/geral/clientes/", request, "ConsultarCliente", Cliente.class).getBody();
  }

  public ClientesCadastroResumido consultarClienteResumido(String nomeFantasia) {
    try {
      HashMap<String, Object> clientesFiltro = new HashMap<>();
      clientesFiltro.put("nome_fantasia", nomeFantasia);

      HashMap<String, Object> request = new HashMap<>();
      request.put("clientesFiltro", clientesFiltro);

      return (ClientesCadastroResumido) httpClient.post("/geral/clientes/", request, "ListarClientesResumido", ClientesCadastroResumido.class).getBody();

    }catch (Exception e){
      System.out.println(e.getMessage());
    }
    return null;
  }

}
