package br.com.costalavos.service;


import br.com.costalavos.model.lancamentos.TitulosEncontrados;
import br.com.costalavos.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class LancamentosService {

  @Autowired
  HttpClient httpClient;

  public TitulosEncontrados buscarLancamentosPorCNPJ(String CNPJ) {
    HashMap<String, Object> request = new HashMap<>();
    request.put("cCPFCNPJCliente", CNPJ);
    request.put("nPagina", 1);
    request.put("nRegPorPagina", 999999999);

    return (TitulosEncontrados) httpClient.post("/financas/pesquisartitulos/", request, "PesquisarLancamentos", TitulosEncontrados.class).getBody();
  }

}
