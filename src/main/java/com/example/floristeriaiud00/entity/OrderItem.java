// Esta clase es una entidad de JPA que representa la tabla "order_item" en la base de datos.


package com.example.floristeriaiud00.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity

@Table(name = "order_item")


public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Flower flower;

    private int quantity;
    private BigDecimal price;

    // Getters and setters
}
