package com.dev.cellcolthes.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private int id;
    private String productName;
    private double price;
    private String description;
    private String image;
    private String categoryName;
    private int quantity;
    private int status;
    private long createDate;
    private long updateDate;
}
