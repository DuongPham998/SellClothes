package com.dev.cellcolthes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private long id;
    private long productId;
    private String productName;
    private int quantity;
    private double totalAmount;
}
