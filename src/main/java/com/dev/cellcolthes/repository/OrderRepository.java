package com.dev.cellcolthes.repository;

import com.dev.cellcolthes.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findOrderByIdAndUserId(long orderId, long userId);
}
