
package com.example.floristeriaiud00.service;

import com.example.floristeriaiud00.model.Seller;
import com.example.floristeriaiud00.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }

    public Optional<Seller> getSellerById(Long id) {
        return sellerRepository.findById(id);
    }

    public Seller addSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    public Seller updateSeller(Long id, Seller sellerDetails) {
        Optional<Seller> seller = sellerRepository.findById(id);

        if (seller.isPresent()) {
            Seller updatedSeller = seller.get();
            updatedSeller.setFirstName(sellerDetails.getFirstName());
            updatedSeller.setLastName(sellerDetails.getLastName());
            updatedSeller.setEmail(sellerDetails.getEmail());
            updatedSeller.setPhone(sellerDetails.getPhone());
            updatedSeller.setAddress(sellerDetails.getAddress());
            return sellerRepository.save(updatedSeller);
        } else {
            return null; // Manejar esto adecuadamente según tu lógica de negocio
        }
    }

    public void deleteSeller(Long id) {
        sellerRepository.deleteById(id);
    }
}