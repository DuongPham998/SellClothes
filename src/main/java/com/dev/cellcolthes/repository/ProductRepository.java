package com.dev.cellcolthes.repository;

import com.dev.cellcolthes.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
