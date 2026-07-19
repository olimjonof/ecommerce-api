package com.example.ecommerce_api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductRequestDTO {
    @NotBlank(message = "Mahsulot nomi bo'sh bo'lishi mumkin emas")
    private String name;

    @Positive(message = "Narx musbat bo'lishi kerak")
    private Double price;

    @Min(value = 0, message = "Ombordagi soni 0 yoki undan katta bo'lishi kerak")
    private Integer stockQuantity;

    private Long categoryId;
}
