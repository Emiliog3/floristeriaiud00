package com.example.floristeriaiud00.dto;

import java.math.BigDecimal;

public class OrdersItemDTO {
    private Long id;
    private Long orderId;
    private Long flowerId;
    private int quantity;
    private BigDecimal price;

    public OrdersItemDTO() {
    }

    public OrdersItemDTO(Long id, Long orderId, Long flowerId, int quantity, BigDecimal price) {
        this.id = id;
        this.orderId = orderId;
        this.flowerId = flowerId;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(Long flowerId) {
        this.flowerId = flowerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
