package com.api.demo_pagination_backend.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.demo_pagination_backend.dtos.ProductDTO;
import com.api.demo_pagination_backend.pagination.PageResponse;
import com.api.demo_pagination_backend.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public PageResponse<ProductDTO> list(Pageable pageable) {

        // Pageable é uma interface que fornece informações sobre a paginação, como o número da página atual e o tamanho da página.
        // PageRequest é uma implementação da interface Pageable que representa uma solicitação de página.
        // O método "of" da classe PageRequest cria uma nova instância de Pageable com o número da página atual e o tamanho da página.
        Pageable safe = PageRequest.of(
            pageable.getPageNumber(),                 // Número da página atual
            Math.min(pageable.getPageSize(),  100) // Limita o tamanho da página a 100
        );

        return PageResponse.of(productRepository.findAll(safe).map(ProductDTO::from)); // Converte os produtos encontrados em ProductDTO

    }
    
}
