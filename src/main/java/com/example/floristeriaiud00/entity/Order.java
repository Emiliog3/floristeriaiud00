// Esta clase es una entidad de JPA que representa la tabla "order" en la base de datos.


package com.example.floristeriaiud00.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity

@Table(name = "order")


public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

    private String occasion;
    private Date deliveryDate;
    private String status;

    // Getters and setters
}
