package com.dev.cellcolthes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "productName")
    private String productName;
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;
    @Column(name = "categoryName")
    private String categoryName;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "status")
    private int status;
    @Column(name = "createDate")
    private long createDate;
    @Column(name = "updareDate")
    private long updateDate;
}
