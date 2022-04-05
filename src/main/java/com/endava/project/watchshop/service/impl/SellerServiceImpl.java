package com.endava.project.watchshop.service.impl;

import com.endava.project.watchshop.exceptions.DataNotFoundException;
import com.endava.project.watchshop.model.Seller;
import com.endava.project.watchshop.model.User;
import com.endava.project.watchshop.repository.SellerRepository;
import com.endava.project.watchshop.service.SellerService;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    private final SellerRepository sellerRepository;

    public SellerServiceImpl(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

//    @Override
//    public User getUserById(int userId) {
//       return sellerRepository.findById(userId).orElseThrow(
//               () -> new DataNotFoundException(String.format("the user with the id " + userId + "couldn't be found"))
//       );
//    }

    @Override
    public Seller getSellerById(int sellerId) {
        return sellerRepository.findById(sellerId).orElseThrow(
                () -> new DataNotFoundException(String.format("the user with the id " + sellerId + "couldn't be found"))
        );
    }

    @Override
    public Seller addSeller(Seller seller) {
        return sellerRepository.save(seller);
    }


}
