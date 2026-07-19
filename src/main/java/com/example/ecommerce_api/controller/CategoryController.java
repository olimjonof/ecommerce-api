package com.example.ecommerce_api.controller;

import com.example.ecommerce_api.dto.CategoryRequestDTO;
import com.example.ecommerce_api.dto.CategoryResponseDTO;
import com.example.ecommerce_api.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public CategoryResponseDTO createCategory(@Valid @RequestBody CategoryRequestDTO dto){
        return categoryService.createCategory(dto);
    }

    @GetMapping
    public List<CategoryResponseDTO> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
