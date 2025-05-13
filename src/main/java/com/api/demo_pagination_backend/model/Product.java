package com.api.demo_pagination_backend.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length =  120)
    private String name;

    @Column(nullable =  false)
    private OffsetDateTime createdAt;  // createdAt é um campo do tipo OffsetDateTime, que representa a data e hora de criação do produto.

    @Column(nullable = false)
    private BigDecimal price;  // price é um campo do tipo BigDecimal, que representa o preço do produto.
    
}
