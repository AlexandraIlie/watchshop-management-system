package com.endava.project.watchshop.controller;

import com.endava.project.watchshop.model.Seller;
import com.endava.project.watchshop.service.SellerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SellerController {

    private final SellerService sellerService;

    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @PostMapping("/seller")
    public ResponseEntity<Seller> addSeller(@RequestBody Seller seller) {
        Seller savedCategory = sellerService.addSeller(seller);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

    @GetMapping("/seller/{sellerId}")
    public ResponseEntity<Seller> getSeller(@PathVariable int sellerId) {
       // Seller sellerById = (Seller) sellerService.getUserById(productId);
        Seller sellerById = sellerService.getSellerById(sellerId);
        return new ResponseEntity<>(sellerById, HttpStatus.OK);
    }

}
