
package com.example.floristeriaiud00.controller;

import com.example.floristeriaiud00.model.Seller;
import com.example.floristeriaiud00.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/")
    public String getAllSellers(Model model) {
        List<Seller> sellers = sellerService.getAllSellers();
        model.addAttribute("sellers", sellers);
        return "seller-list";
    }

    @GetMapping("/add")
    public String showAddSellerForm(Model model) {
        model.addAttribute("seller", new Seller());
        return "seller-form";
    }

    @PostMapping("/add")
    public String addSeller(@ModelAttribute Seller seller) {
        sellerService.addSeller(seller);
        return "redirect:/sellers/";
    }

    @GetMapping("/edit/{id}")
    public String showEditSellerForm(@PathVariable Long id, Model model) {
        Seller seller = sellerService.getSellerById(id).orElse(null);
        model.addAttribute("seller", seller);
        return "seller-form";
    }

    @PostMapping("/edit/{id}")
    public String updateSeller(@PathVariable Long id, @ModelAttribute Seller seller) {
        sellerService.updateSeller(id, seller);
        return "redirect:/sellers/";
    }

    @GetMapping("/delete/{id}")
    public String deleteSeller(@PathVariable Long id) {
        sellerService.deleteSeller(id);
        return "redirect:/sellers/";
    }
}