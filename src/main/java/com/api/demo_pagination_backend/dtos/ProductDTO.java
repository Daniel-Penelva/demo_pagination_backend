package com.api.demo_pagination_backend.dtos;

import java.math.BigDecimal;

import com.api.demo_pagination_backend.model.Product;

public record ProductDTO(String name, BigDecimal price) {

    // Método static para não precisar dar uma instancia nela, ou seja, para não precisar dar um new nela.
    public static ProductDTO from(Product p) {
        return new ProductDTO(p.getName(), p.getPrice());
    }
} 