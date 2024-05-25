// Esta clase es una entidad de JPA que representa la tabla "flower" en la base de datos.

package com.example.floristeriaiud00.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

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


