package com.vitorcampos.e_commerce.repository;

import com.vitorcampos.e_commerce.model.Pedido;
import com.vitorcampos.e_commerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui
}