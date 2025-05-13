package com.api.demo_pagination_backend.pagination;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PageResponse<T>(
    @JsonProperty("items") List<T> content,   // Lista genérica que contém os itens da página atual.
    int page,                                 // Número da página atual.
    int size,                                 // Tamanho da página (número de elementos por página).
    long totalElement,                        // Número total de elementos disponíveis (não apenas os da página atual).
    boolean hasNext                           // Um indicador booleano que informa se há uma próxima página disponível.
    ) {

        // O construtor é privado, o que significa que não pode ser instanciado diretamente.
        // Ele só pode ser instanciado através do método estático "of".
        // O método "of" é um método de fábrica que cria uma nova instância de PageResponse a partir de um objeto Page.
        public static<T> PageResponse<T> of (Page<T> page) {
            return new PageResponse<>(
                page.getContent(),        // Retorna o conteúdo da página atual.
                page.getNumber(),         // Retorna o número da página atual.
                page.getSize(),           // Retorna o tamanho da página (número de elementos por página).
                page.getTotalPages(),     // Retorna o número total de páginas disponíveis.
                page.hasNext()            // Retorna se há uma próxima página disponível.
            );
        }
    
}
