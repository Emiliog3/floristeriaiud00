package com.example.floristeriaiud00.service;


import com.example.floristeriaiud00.model.Flower;
import com.example.floristeriaiud00.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlowerService {

    @Autowired
    private FlowerRepository flowerRepository;

    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    public Optional<Flower> getFlowerById(Long id) {
        return flowerRepository.findById(id);
    }

    public Flower saveFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    public void deleteFlower(Long id) {
        flowerRepository.deleteById(id);
    }
}