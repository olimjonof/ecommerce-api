package com.example.ecommerce_api.service;

import com.example.ecommerce_api.dto.CategoryRequestDTO;
import com.example.ecommerce_api.dto.CategoryResponseDTO;
import com.example.ecommerce_api.model.Category;
import com.example.ecommerce_api.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    // CREATE
    public CategoryResponseDTO createCategory(CategoryRequestDTO requestDTO) {

        Category category = Category.builder()
                .name(requestDTO.getName())
                .description(requestDTO.getDescription())
                .build();

        Category savedCategory = categoryRepository.save(category);

        return CategoryResponseDTO.builder()
                .id(savedCategory.getId())
                .name(savedCategory.getName())
                .description(savedCategory.getDescription())
                .build();
    }

    // GET ALL
    public List<CategoryResponseDTO> getAllCategories() {

        return categoryRepository.findAll()
                .stream()
                .map(category -> CategoryResponseDTO.builder()
                        .id(category.getId())
                        .name(category.getName())
                        .description(category.getDescription())
                        .build())
                .toList();
    }
}
