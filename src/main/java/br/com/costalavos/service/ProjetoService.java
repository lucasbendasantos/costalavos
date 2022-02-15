package br.com.costalavos.service;

import br.com.costalavos.model.projeto.Projeto;
import br.com.costalavos.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.HashMap;

@Service
public class ProjetoService {

  @Autowired
  HttpClient httpClient;

  public Projeto buscarProjetoByCodigo(BigInteger codigo){
    HashMap<String, BigInteger> request = new HashMap<>();
    request.put("codigo", codigo);
    return (Projeto) httpClient.post("/geral/projetos/", request, "ConsultarProjeto", Projeto.class).getBody();
  }
}
