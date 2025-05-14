package com.api.demo_pagination_backend.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo_pagination_backend.dtos.ProductDTO;
import com.api.demo_pagination_backend.pagination.PageResponse;
import com.api.demo_pagination_backend.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // http://localhost:8080/api/v1/product
    //http://localhost:8080/api/v1/product?page=0&size=5    (Na página 0, com 5 itens por página)
    //http://localhost:8080/api/v1/product?page=1&size=5    (Na página 1, com 5 itens por página)
    //http://localhost:8080/api/v1/product?page=2&size=5    (Na página 2, com 5 itens por página)
    // http://localhost:8080/api/v1/product?page=0&size=10&sort=name,asc   (Na página 0, com 10 itens por página, ordenados pelo nome em ordem crescente)
    @GetMapping
    public PageResponse<ProductDTO> list(Pageable pageable) {
        return productService.list(pageable);
    }

}
