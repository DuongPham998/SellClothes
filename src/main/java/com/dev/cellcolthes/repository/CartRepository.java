package com.dev.cellcolthes.repository;

import com.dev.cellcolthes.model.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
