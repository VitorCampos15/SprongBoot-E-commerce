package com.vitorcampos.e_commerce.controller;

import com.vitorcampos.e_commerce.model.ItemPedido;
import com.vitorcampos.e_commerce.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itemPedidos")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    @PostMapping
    public ResponseEntity<ItemPedido> criarItemPedido(@RequestBody ItemPedido itemPedido) {
        ItemPedido novoItemPedido = itemPedidoService.criarItemPedido(itemPedido);
        return ResponseEntity.ok(novoItemPedido);
    }

    @GetMapping
    public ResponseEntity<List<ItemPedido>> listarItemPedidos() {
        return ResponseEntity.ok(itemPedidoService.listarItemPedidos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedido> buscarItemPedidoPorId(@PathVariable Long id) {
        return itemPedidoService.buscarItemPedidoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemPedido> atualizarItemPedido(@PathVariable Long id, @RequestBody ItemPedido itemPedido) {
        try {
            ItemPedido itemPedidoAtualizado = itemPedidoService.atualizarItemPedido(id, itemPedido);
            return ResponseEntity.ok(itemPedidoAtualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarItemPedido(@PathVariable Long id) {
        itemPedidoService.deletarItemPedido(id);
        return ResponseEntity.noContent().build();
    }
}
