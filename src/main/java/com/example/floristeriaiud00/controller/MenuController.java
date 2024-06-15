
package com.example.floristeriaiud00.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/home/")
    public String showMenu() {
        return "menu"; // Este nombre debe coincidir con el nombre de tu archivo HTML sin la extensión
    }

    @GetMapping("/customers")
    public String showCustomers() {
        return "customers"; // Nombre del archivo HTML para la página de clientes
    }

    @GetMapping("/orders")
    public String showOrders() {
        return "orders"; // Nombre del archivo HTML para la página de órdenes
    }

    @GetMapping("/flowers")
    public String showFlowers() {
        return "flowers"; // Nombre del archivo HTML para la página de flores
    }
}