/*
 
Esta clase es un servicio que se encarga de gestionar las flores en la base de datos.
Es decir, se encarga de la lógica de negocio de las flores. 
Por ejemplo, se encarga de llamar a los métodos del repositorio FlowerRepository.

 */



package com.example.floristeriaiud00.service;

import com.example.floristeriaiud00.entity.Flower;
import com.example.floristeriaiud00.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    @Autowired
    private FlowerRepository flowerRepository;

    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    public Flower getFlowerById(Long id) {
        return flowerRepository.findById(id).orElse(null);
    }

    public Flower saveFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    public void deleteFlower(Long id) {
        flowerRepository.deleteById(id);
    }
}
