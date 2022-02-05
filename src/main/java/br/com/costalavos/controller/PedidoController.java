package br.com.costalavos.controller;

import br.com.costalavos.model.pedido.PedidoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {


    @PostMapping
    public ResponseEntity<List<PedidoResponse>> listarTodos(){


        return null;
    }



}
