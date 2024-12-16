package com.vitorcampos.e_commerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "produto")
@Data // Gera automaticamente getters, setters, toString e equals/hashCode
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String descricao;

    @Column(nullable = false)
    private float preco;

    @Column(nullable = false)
    private int estoque;

    @OneToMany(mappedBy = "produto")
    @JsonIgnore
    private List<ItemPedido> itemPedidos;

}