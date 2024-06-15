
package com.example.floristeriaiud00.controller;

import com.example.floristeriaiud00.model.Order1;
import com.example.floristeriaiud00.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String getAllOrders(Model model) {
        List<Order1> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "order-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("order", new Order1());
        return "order-form";
    }




    @PostMapping("/add")
    public String addOrder(@ModelAttribute("order") Order1 order) {
        // La conversión de String a LocalDate debería ser manejada automáticamente por Spring Boot
        orderService.saveOrder(order);
        return "redirect:/orders/";
    }





    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Order1 order = orderService.getOrderById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid order Id:" + id));
        model.addAttribute("order", order);
        return "order-form";
    }

    @PostMapping("/edit/{id}")
    public String updateOrder(@PathVariable("id") Long id, @ModelAttribute("order") Order1 order) {
        order.setId(id);
        orderService.saveOrder(order);
        return "redirect:/orders/";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrder(@PathVariable("id") Long id) {
        orderService.deleteOrder(id);
        return "redirect:/orders/";
    }
}