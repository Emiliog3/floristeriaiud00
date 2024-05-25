/* 
Esta clase es un servicio que se encarga de gestionar los datos de los clientes en la base de datos.
Es decir, se encarga de la comunicación entre el controlador y el repositorio de la entidad "Customer".}
Por ejemplo, el método "getAllCustomers" devuelve una lista con todos los clientes almacenados en la base de datos.

    */

package com.example.floristeriaiud00.service;

import com.example.floristeriaiud00.entity.Customer;
import com.example.floristeriaiud00.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
