/*
 Esta clase sirve para definir un objeto de transferencia de datos (DTO) de flor.
 Es decir, esta clase se encarga de manejar los datos de las flores de la floristería.
 Por ejemplo, se encarga de recuperar los datos de una flor, guardar los datos de una flor, eliminar los datos de una flor, etc.
 */


package com.example.floristeriaiud00.dto;

import java.math.BigDecimal;

public class FlowerDTO {
    private Long id;
    private String type;
    private String color;
    private String variety;
    private int quantity;
    private BigDecimal purchasePrice;
    private BigDecimal salePrice;

    public FlowerDTO() {
    }

    public FlowerDTO(Long id, String type, String color, String variety, int quantity, BigDecimal purchasePrice,
            BigDecimal salePrice) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.variety = variety;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }
}
