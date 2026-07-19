package com.example.ecommerce_api.controller;

import com.example.ecommerce_api.dto.ProductRequestDTO;
import com.example.ecommerce_api.dto.ProductResponseDTO;
import com.example.ecommerce_api.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ProductResponseDTO createProduct(@Valid @RequestBody ProductRequestDTO dto){
        return productService.createProduct(dto);

    }

    @GetMapping
    public List<ProductResponseDTO> getAllProducts(){
        return productService.getAllProducts();
    }
}
