package com.dev.cellcolthes.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetailDTO {
    private long id;
    private long orderId;
    private long productId;
    private String productName;
    private int quantity;
    private double unitPrice;
    private double totalAmount;
}
