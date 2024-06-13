// Esta clase es una entidad de JPA que representa la tabla "order_item" en la base de datos.


package com.example.floristeriaiud00.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "order_item")


public class OrdersItem {

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
