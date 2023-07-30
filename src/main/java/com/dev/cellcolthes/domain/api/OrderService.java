package com.dev.cellcolthes.domain.api;

import com.dev.cellcolthes.model.dto.CartDTO;
import com.dev.cellcolthes.model.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    boolean insertOder(List<CartDTO> cartDTOS, long userId, String phone, String fullName, String shipAddress);

    boolean updateOrder(List<CartDTO> cartDTOS, long orderId, long userId, String phone, String fullName, String shipAddress);

    boolean orderDeleteOrder(long orderId, long userId);

    List<OrderDTO> getOrders(long userId, int pageSize, int pageNo);
}
