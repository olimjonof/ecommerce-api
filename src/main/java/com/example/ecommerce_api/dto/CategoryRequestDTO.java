package com.example.ecommerce_api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryRequestDTO {

    @NotBlank(message = "Kategoriya nomi bo'sh bo'lishi mumkin emas")
    private String name;

    private String description;

}
