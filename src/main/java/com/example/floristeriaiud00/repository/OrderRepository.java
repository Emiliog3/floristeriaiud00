
package com.example.floristeriaiud00.repository;

import com.example.floristeriaiud00.model.Order1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order1, Long> {
}