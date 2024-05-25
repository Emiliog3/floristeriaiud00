// Esta clase es un repositorio de JPA que se encarga de gestionar la tabla "order" en la base de datos.


package com.example.floristeriaiud00.repository;

import com.example.floristeriaiud00.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order, Long> {
}
