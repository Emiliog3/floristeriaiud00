
package com.example.floristeriaiud00.service;

import com.example.floristeriaiud00.model.Order1;
import com.example.floristeriaiud00.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order1> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order1> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order1 saveOrder(Order1 order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}