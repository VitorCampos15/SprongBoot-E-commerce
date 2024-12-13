package com.vitorcampos.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "item_pedido")
@Data // Gera automaticamente getters, setters, toString e equals/hashCode
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false) // Define a chave estrangeira no banco
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false) // Define a chave estrangeira no banco
    private Produto produto;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private float precoUnitario;


}