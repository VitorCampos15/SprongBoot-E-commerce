package com.vitorcampos.e_commerce.repository;

import com.vitorcampos.e_commerce.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui
}