package com.endava.project.watchshop.service;

import com.endava.project.watchshop.model.Seller;
import com.endava.project.watchshop.model.User;

//public interface SellerService extends UserService{
public interface SellerService{

    //added later
    Seller getSellerById(int sellerId);

    Seller addSeller(Seller seller);

}
