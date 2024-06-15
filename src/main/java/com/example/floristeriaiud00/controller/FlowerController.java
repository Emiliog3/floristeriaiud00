
package com.example.floristeriaiud00.controller;

import com.example.floristeriaiud00.model.Flower;
import com.example.floristeriaiud00.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/flowers")
public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    @GetMapping("/")
    public String getAllFlowers(Model model) {
        List<Flower> flowers = flowerService.getAllFlowers();
        model.addAttribute("flowers", flowers);
        return "flower-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("flower", new Flower());
        return "flower-form";
    }

    @PostMapping("/add")
    public String addFlower(@ModelAttribute("flower") Flower flower) {
        flowerService.saveFlower(flower);
        return "redirect:/flowers/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Flower flower = flowerService.getFlowerById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid flower Id:" + id));
        model.addAttribute("flower", flower);
        return "flower-form";
    }

    @PostMapping("/edit/{id}")
    public String updateFlower(@PathVariable("id") Long id, @ModelAttribute("flower") Flower flower) {
        flower.setId(id);
        flowerService.saveFlower(flower);
        return "redirect:/flowers/";
    }

    @GetMapping("/delete/{id}")
    public String deleteFlower(@PathVariable("id") Long id) {
        flowerService.deleteFlower(id);
        return "redirect:/flowers/";
    }
}