package com.example.ecommerce_api.dto;

import lombok.Data;

@Data
public class ProductResponseDTO {
    private Long id;

    private String name;

    private Double price;

    private Integer stockQuantity;

    private String categoryName;

}
