package com.vitorcampos.e_commerce.service;

import com.vitorcampos.e_commerce.model.ItemPedido;
import com.vitorcampos.e_commerce.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public ItemPedido criarItemPedido(ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    public List<ItemPedido> listarItemPedidos() {
        return itemPedidoRepository.findAll();
    }

    public Optional<ItemPedido> buscarItemPedidoPorId(Long id) {
        return itemPedidoRepository.findById(id);
    }
    //verificar funçao Update
    public ItemPedido atualizarItemPedido(Long id, ItemPedido itemPedidoAtualizado) {
        ItemPedido itemPedidoExistente = itemPedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        itemPedidoExistente.setProduto(itemPedidoAtualizado.getProduto());
        itemPedidoExistente.setPedido(itemPedidoAtualizado.getPedido());
        itemPedidoExistente.setQuantidade(itemPedidoAtualizado.getQuantidade());
        itemPedidoExistente.setPrecoUnitario(itemPedidoAtualizado.getPrecoUnitario());
        return itemPedidoRepository.save(itemPedidoExistente);
    }

    public void deletarItemPedido(Long id) {
        itemPedidoRepository.deleteById(id);
    }
}
