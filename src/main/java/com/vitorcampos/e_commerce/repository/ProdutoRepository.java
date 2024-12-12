package com.vitorcampos.e_commerce.repository;

import com.vitorcampos.e_commerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui
}