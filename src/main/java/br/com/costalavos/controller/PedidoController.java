package br.com.costalavos.controller;

import br.com.costalavos.model.paginacao.Paginacao;
import br.com.costalavos.model.pedido.PedidoRequest;
import br.com.costalavos.model.pedido.PedidoResponse;
import br.com.costalavos.model.pedido.PedidoVendaProduto;
import br.com.costalavos.model.pedido.PedidoVendaProdutoLista;
import br.com.costalavos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/pedido")
public class PedidoController {

    @Autowired
    PedidoService service;

    @PostMapping
    public ResponseEntity<PedidoVendaProdutoLista> listarTodos(@RequestBody PedidoRequest pedidoRequest){
        return ResponseEntity.ok(service.listarTodos(pedidoRequest));
    }

    @GetMapping
    public ResponseEntity<PedidoVendaProduto> consultarPedido(@RequestParam("numero_pedido") BigInteger numeroPedido){
        return ResponseEntity.ok(service.consultarPedido(numeroPedido));
    }

}
