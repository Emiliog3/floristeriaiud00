// Esta clase sirve para manejar las peticiones GET a las rutas "/api/orders" y retornar los datos de las órdenes en formato JSON.



package com.example.floristeriaiud00.controller;

import com.example.floristeriaiud00.entity.Order;
import com.example.floristeriaiud00.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping
    public List<Order> getAllOrders() {
        return ordersService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        Order order = ordersService.getOrderById(id);
        if (order == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(order);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return ordersService.saveOrder(order);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        if (ordersService.getOrderById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        ordersService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }
}