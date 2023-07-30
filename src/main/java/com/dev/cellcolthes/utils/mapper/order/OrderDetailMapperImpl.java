package com.dev.cellcolthes.utils.mapper.order;

import com.dev.cellcolthes.model.dto.OrderDetailDTO;
import com.dev.cellcolthes.model.entity.OrderDetail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OrderDetailMapperImpl implements OrderDetailMapper {
    private static final OrderDetailMapperImpl orderDetailMapper = new OrderDetailMapperImpl();
    public static OrderDetailMapperImpl getInstance() {return orderDetailMapper;}
    private OrderDetailMapperImpl() {}

    @Override
    public OrderDetail orderDetailDTOToOrderDetail(OrderDetailDTO orderDetailDTO) {
        if (orderDetailDTO != null) {
            return new OrderDetail (
                    orderDetailDTO.getId(),
                    orderDetailDTO.getOrderId(),
                    orderDetailDTO.getProductId(),
                    orderDetailDTO.getProductName(),
                    orderDetailDTO.getQuantity(),
                    orderDetailDTO.getUnitPrice(),
                    orderDetailDTO.getTotalAmount()
            );
        }
        return null;
    }

    @Override
    public OrderDetailDTO orderDetailToOrderDetailDTO(OrderDetail orderDetail) {
        if (orderDetail != null) {
            return new OrderDetailDTO (
                    orderDetail.getId(),
                    orderDetail.getOrderId(),
                    orderDetail.getProductId(),
                    orderDetail.getProductName(),
                    orderDetail.getQuantity(),
                    orderDetail.getUnitPrice(),
                    orderDetail.getTotalAmount()
            );
        }
        return null;
    }

    @Override
    public List<OrderDetailDTO> listOrderDetailToListOrderDetailDTo(List<OrderDetail> orderDetails) {
        if (orderDetails != null && !orderDetails.isEmpty()) {
            return orderDetails.stream().filter(Objects::nonNull).map(this::orderDetailToOrderDetailDTO).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
