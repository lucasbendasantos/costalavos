package br.com.costalavos.util;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpClient {

    public ResponseEntity<?> post(String url, Object request, String call ,Class<?> responseModel){

        return new RestTemplate().postForEntity(url,  request, responseModel );
    }

}
