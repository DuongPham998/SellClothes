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
@Table(name = "tbl_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "categoryName")
    private String categoryName;
    @Column(name = "description")
    private String description;
    @Column(name = "categoryParent")
    private int categoryParent;
    @Column(name = "status")
    private int status;
    @Column(name = "categoryOrder")
    private int categoryOrder;
}
