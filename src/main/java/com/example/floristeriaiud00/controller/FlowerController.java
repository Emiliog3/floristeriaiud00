// Esta clase sirve para manejar las peticiones GET a las rutas "/api/customers" y retornar los datos de los clientes en formato JSON.

package com.example.floristeriaiud00.controller;

import com.example.floristeriaiud00.entity.Flower;
import com.example.floristeriaiud00.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")

public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    @GetMapping
    public List<Flower> getAllFlowers() {
        return flowerService.getAllFlowers();
    }

    @GetMapping("/{id}")
    public Flower getFlowerById(@PathVariable Long id) {
        return flowerService.getFlowerById(id);
    }

    @PostMapping
    public Flower saveFlower(@RequestBody Flower flower) {
        return flowerService.saveFlower(flower);
    }

    @DeleteMapping("/{id}")
    public void deleteFlower(@PathVariable Long id) {
        flowerService.deleteFlower(id);
    }
}
