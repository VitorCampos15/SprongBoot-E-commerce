package com.vitorcampos.e_commerce.service;

import com.vitorcampos.e_commerce.model.Pedido;
import com.vitorcampos.e_commerce.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id);
    }
    //verificar funçao Update
    public Pedido atualizarPedido(Long id, Pedido pedidoAtualizado) {
        Pedido pedidoExistente = pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        pedidoExistente.setUsuario(pedidoAtualizado.getUsuario());
        pedidoExistente.setDataPedido(pedidoAtualizado.getDataPedido());
        pedidoExistente.setValorTotal(pedidoAtualizado.getValorTotal());
        return pedidoRepository.save(pedidoExistente);
    }

    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
