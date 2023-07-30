package com.dev.cellcolthes.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartDTO {
    private long id;
    private long productId;
    private String productName;
    private int quantity;
    private double totalAmount;
}
