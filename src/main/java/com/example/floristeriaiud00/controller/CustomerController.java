// Esta clase sirve para manejar las peticiones GET a las rutas "/home" y "/home/index" y retornar las vistas "home2" y "home" respectivamente.

package com.example.floristeriaiud00.controller;

import com.example.floristeriaiud00.entity.Customer;
import com.example.floristeriaiud00.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Anotación para marcar la clase como un controlador REST en Spring MVC
@RequestMapping("/api/customers") // URL base para todos los métodos de este controlador
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() { // Método para manejar peticiones GET a "/api/customers"
        return customerService.getAllCustomers(); // Retorna la lista de clientes almacenados en la base de datos
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) { // Método para manejar peticiones GET a "/api/customers/{id}"
        return customerService.getCustomerById(id); // Retorna el cliente con el ID especificado
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) { // Método para manejar peticiones POST a "/api/customers"
        return customerService.saveCustomer(customer); // Guarda el cliente en la base de datos y lo retorna
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) { // Método para manejar peticiones DELETE a "/api/customers/{id}"
        customerService.deleteCustomer(id); // Elimina el cliente con el ID especificado de la base de datos
    }
}

