package com.endava.project.watchshop.repository;

import com.endava.project.watchshop.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Integer> {

}
