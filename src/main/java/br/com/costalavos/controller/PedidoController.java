package br.com.costalavos.controller;

import br.com.costalavos.model.paginacao.Paginacao;
import br.com.costalavos.model.pedido.PedidoResponse;
import br.com.costalavos.model.pedido.PedidoVendaProduto;
import br.com.costalavos.model.pedido.PedidoVendaProdutoLista;
import br.com.costalavos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/pedido")
public class PedidoController {

    @Autowired
    PedidoService service;

    @PostMapping
    public ResponseEntity<PedidoVendaProdutoLista> listarTodos(@RequestBody Paginacao paginacao){
        return ResponseEntity.ok(service.listarTodos(paginacao));
    }

    @GetMapping
    public ResponseEntity<PedidoVendaProduto> consultarPedido(@RequestParam("codigo_pedido") int codigoPedido){
        return ResponseEntity.ok(service.consultarPedido(codigoPedido));
    }

}
