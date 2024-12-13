package com.vitorcampos.e_commerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedido")
@Data // Gera automaticamente getters, setters, toString e equals/hashCode
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false) // Define a chave estrangeira no banco
    private Usuario usuario;

    @Column(nullable = false)
    private LocalDate dataPedido;

    @Column(nullable = false)
    private float valorTotal;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemPedido> itemPedidos;

}
