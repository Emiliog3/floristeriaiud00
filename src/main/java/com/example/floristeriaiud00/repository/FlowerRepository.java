// Esta clase es un repositorio de JPA que se encarga de gestionar la tabla "customer" en la base de datos.


package com.example.floristeriaiud00.repository;

import com.example.floristeriaiud00.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
}
