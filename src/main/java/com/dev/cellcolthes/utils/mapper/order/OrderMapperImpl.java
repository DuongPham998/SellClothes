package com.dev.cellcolthes.utils.mapper.order;

import com.dev.cellcolthes.model.dto.OrderDTO;
import com.dev.cellcolthes.model.entity.Order;
import com.dev.cellcolthes.model.entity.OrderDetail;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OrderMapperImpl implements OrderMapper {
    private static final OrderMapperImpl orderMapper = new OrderMapperImpl();
    public static OrderMapperImpl getInstance() { return orderMapper; }
    private OrderMapperImpl() {}
    @Override
    public Order orderToOrderDTO(OrderDTO orderDTO) {
        if (orderDTO != null) {
            return new Order(
                    orderDTO.getId(),
                    orderDTO.getUserId(),
                    orderDTO.getFullName(),
                    orderDTO.getPhone(),
                    orderDTO.getShipAddress(),
                    orderDTO.getTotalAmount(),
                    orderDTO.getUpdateDate(),
                    orderDTO.getOrderDate(),
                    orderDTO.getStatus()
            );
        }
        return null;
    }

    @Override
    public OrderDTO orderDtoToOrder(Order order) {
        if (order != null) {
            return new OrderDTO(
                    order.getId(),
                    order.getUserId(),
                    order.getFullName(),
                    order.getPhone(),
                    order.getShipAddress(),
                    order.getTotalAmount(),
                    order.getOrderDate(),
                    order.getUpdateDate(),
                    order.getStatus()
            );
        }
        return null;
    }

    @Override
    public List<OrderDTO> ordersToOrders(List<Order> orders) {
        if (orders != null && !orders.isEmpty()) {
            return orders.stream().filter(Objects::nonNull).map(this::orderDtoToOrder).collect(Collectors.toList());
        }
        return null;
    }
}
