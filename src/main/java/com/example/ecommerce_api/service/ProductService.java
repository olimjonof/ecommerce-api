package com.example.ecommerce_api.service;

import com.example.ecommerce_api.dto.ProductRequestDTO;
import com.example.ecommerce_api.dto.ProductResponseDTO;
import com.example.ecommerce_api.model.Category;
import com.example.ecommerce_api.model.Product;
import com.example.ecommerce_api.repository.CategoryRepository;
import com.example.ecommerce_api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    // Mahsulot qo'shish
    public ProductResponseDTO createProduct(ProductRequestDTO dto) {

        Category category = categoryRepository.findById(dto.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Kategoriya topilmadi!"));

        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setStockQuantity(dto.getStockQuantity());
        product.setCategory(category);

        Product savedProduct = productRepository.save(product);

        ProductResponseDTO response = new ProductResponseDTO();
        response.setId(savedProduct.getId());
        response.setName(savedProduct.getName());
        response.setPrice(savedProduct.getPrice());
        response.setStockQuantity(savedProduct.getStockQuantity());
        response.setCategoryName(savedProduct.getCategory().getName());

        return response;
    }

    // Barcha mahsulotlarni olish
    public List<ProductResponseDTO> getAllProducts() {

        return productRepository.findAll()
                .stream()
                .map(product -> {
                    ProductResponseDTO response = new ProductResponseDTO();
                    response.setId(product.getId());
                    response.setName(product.getName());
                    response.setPrice(product.getPrice());
                    response.setStockQuantity(product.getStockQuantity());
                    response.setCategoryName(product.getCategory().getName());
                    return response;
                })
                .toList();
    }
}
