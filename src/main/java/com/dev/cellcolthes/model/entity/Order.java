package com.dev.cellcolthes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    private long id;
    private long userId;
    private String fullName;
    private String phone;
    private String shipAddress;
    private double totalAmount;
    private long orderDate;
    private long updateDate;
    private int status;

    public Order(long userId, String fullName, String phone, String shipAddress, double totalAmount, long orderDate, long updateDate, int status) {
        this.userId = userId;
        this.fullName = fullName;
        this.phone = phone;
        this.shipAddress = shipAddress;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.updateDate = updateDate;
        this.status = status;
    }
}
