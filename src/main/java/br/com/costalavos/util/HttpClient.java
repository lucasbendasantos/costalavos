package br.com.costalavos.util;

import br.com.costalavos.model.paginacao.Paginacao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;

@Component
public class HttpClient {

    @Value("${omie.appKey}")
    private String appKey;

    @Value("${omie.appSecret}")
    private String appSecret;

    @Value("${omie.url}")
    private String URL;


    public ResponseEntity<?> post(String context, Object request, String call , Class<?> responseModel){

        ArrayList<Object> listParam =  new ArrayList<>();

        HashMap<String, Object> credenciais = new HashMap<>();
        credenciais.put("call", call);
        credenciais.put("app_key", appKey);
        credenciais.put("app_secret", appSecret);

        listParam.add(request);
        credenciais.put("param",listParam);

        return new RestTemplate().postForEntity(URL + context, credenciais, responseModel);
    }

}
