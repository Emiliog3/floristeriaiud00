// Esta clase es un repositorio de JPA que se encarga de gestionar la tabla "order_item" en la base de datos.


package com.example.floristeriaiud00.repository;

import com.example.floristeriaiud00.entity.OrdersItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrdersItem, Long> {
}
