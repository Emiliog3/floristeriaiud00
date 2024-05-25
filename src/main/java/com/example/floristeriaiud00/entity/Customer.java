// Esta clase es una entidad de JPA que representa la tabla "customer" en la base de datos.

package com.example.floristeriaiud00.entity;

import jakarta.persistence.*;

@Entity

@Table(name = "customer")


public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String contactInfo;

    // Getters and setters
}
