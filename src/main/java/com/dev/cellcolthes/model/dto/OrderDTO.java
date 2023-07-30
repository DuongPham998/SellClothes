package com.dev.cellcolthes.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDTO {
    private long id;
    private long userId;
    private String fullName;
    private String phone;
    private String shipAddress;
    private double totalAmount;
    private long orderDate;
    private long updateDate;
    private int status;
}
