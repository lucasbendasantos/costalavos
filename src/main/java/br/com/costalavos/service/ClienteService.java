package br.com.costalavos.service;

import br.com.costalavos.model.cliente.Cliente;
import br.com.costalavos.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.HashMap;

@Service
public class ClienteService {

    @Autowired
    HttpClient httpClient;

    public Cliente consultarCliente(BigInteger codigoClienteOmie){
        HashMap<String, BigInteger> request = new HashMap<>();
        request.put("codigo_cliente_omie", codigoClienteOmie);
        return (Cliente) httpClient.post("/geral/clientes/", request, "ConsultarCliente", Cliente.class).getBody();
    }

}
