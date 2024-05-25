/*
 Esta clase sirve para manejar las peticiones GET a las rutas "/api/orders" y retornar los datos de las órdenes en formato JSON.
Es decir, esta clase se encarga de manejar las peticiones HTTP relacionadas con las órdenes de la floristería.
Por ejemplo, se encarga de recuperar todas las órdenes, recuperar una orden por su id, guardar una orden, eliminar una orden, etc.
    
 
 */


package com.example.floristeriaiud00.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {
    private Long id;
    private Long customerId;
    private String occasion;
    private Date deliveryDate;
    private String status;
    private List<OrdersItemDTO> orderItems;

    public OrderDTO() {
    }

    public OrderDTO(Long id, Long customerId, String occasion, Date deliveryDate, String status,
            List<OrdersItemDTO> orderItems) {
        this.id = id;
        this.customerId = customerId;
        this.occasion = occasion;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.orderItems = orderItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrdersItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrdersItemDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
