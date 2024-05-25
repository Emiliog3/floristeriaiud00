/*
 Esta clase es un servicio que se encarga de gestionar las operaciones relacionadas con la tabla "order" en la base de datos.
 Es decir, se encarga de gestionar los pedidos.
 Por ejemplo, se encarga de recuperar todos los pedidos, recuperar un pedido por su id, guardar un pedido, eliminar un pedido, etc.
 */



package com.example.floristeriaiud00.service;

import com.example.floristeriaiud00.entity.Order;
import com.example.floristeriaiud00.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
