// Esta clase sirve para manejar las peticiones GET a las rutas "/api/customers" y retornar los datos de los clientes en formato JSON.


package com.example.floristeriaiud00.controller;

import com.example.floristeriaiud00.entity.Flower;
import com.example.floristeriaiud00.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    @GetMapping
    public List<Flower> getAllFlowers() {
        return flowerService.getAllFlowers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flower> getFlowerById(@PathVariable Long id) {
        Flower flower = flowerService.getFlowerById(id);
        if (flower == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(flower);
    }

    @PostMapping
    public Flower createFlower(@RequestBody Flower flower) {
        return flowerService.saveFlower(flower);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlower(@PathVariable Long id) {
        if (flowerService.getFlowerById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        flowerService.deleteFlower(id);
        return ResponseEntity.noContent().build();
    }
}