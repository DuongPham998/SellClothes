package com.dev.cellcolthes.utils.mapper.order;

import com.dev.cellcolthes.model.dto.OrderDetailDTO;
import com.dev.cellcolthes.model.entity.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {
    OrderDetail orderDetailDTOToOrderDetail(OrderDetailDTO orderDetailDTO);

    OrderDetailDTO orderDetailToOrderDetailDTO(OrderDetail orderDetail);

    List<OrderDetailDTO> listOrderDetailToListOrderDetailDTo(List<OrderDetail> orderDetails);
}
