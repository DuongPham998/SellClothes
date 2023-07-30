package com.dev.cellcolthes.utils.mapper.order;

import com.dev.cellcolthes.model.dto.OrderDTO;
import com.dev.cellcolthes.model.entity.Order;

import java.util.List;

public interface OrderMapper {
    Order orderToOrderDTO(OrderDTO orderDTO);

    OrderDTO orderDtoToOrder(Order order);

    List<OrderDTO> ordersToOrders(List<Order> orders);
}
