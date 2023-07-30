package com.dev.cellcolthes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    private long id;
    private long orderId;
    private long productId;
    private String productName;
    private int quantity;
    private double unitPrice;
    private double totalAmount;
}
