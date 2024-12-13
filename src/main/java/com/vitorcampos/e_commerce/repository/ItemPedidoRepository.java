package com.vitorcampos.e_commerce.repository;

import com.vitorcampos.e_commerce.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui
}