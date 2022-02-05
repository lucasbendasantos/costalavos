package br.com.costalavos.service;

import br.com.costalavos.model.cliente.Cliente;
import br.com.costalavos.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ClienteService {

    @Autowired
    HttpClient httpClient;

    public Cliente consultarCliente(int codigoClienteOmie){
        HashMap<String, Integer> request = new HashMap<String, Integer>();
        request.put("codigo_cliente_omie", codigoClienteOmie);
        return (Cliente) httpClient.post("/geral/clientes/", request, "ConsultarCliente", Cliente.class).getBody();
    }

}
