package com.example.ecommerce_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private Integer stockQuantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
