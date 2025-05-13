package com.api.demo_pagination_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.demo_pagination_backend.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
