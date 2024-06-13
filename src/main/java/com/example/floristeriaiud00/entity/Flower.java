// Esta clase es una entidad de JPA que representa la tabla "flower" en la base de datos.

package com.example.floristeriaiud00.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "flower")


public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String color;
    private String variety;
    private int quantity;
    private BigDecimal purchasePrice;
    private BigDecimal salePrice;

    // Getters and setters
}


