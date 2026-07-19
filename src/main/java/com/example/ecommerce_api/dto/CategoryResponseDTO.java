package com.example.ecommerce_api.dto;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class CategoryResponseDTO {
    @Id
    private Long id;

    public String name;

    private String description;


}
