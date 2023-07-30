package com.dev.cellcolthes.domain.api;

import com.dev.cellcolthes.model.dto.CartDTO;
import com.dev.cellcolthes.model.dto.OrderDetailDTO;

import java.util.List;

public interface OrderDetailService {
    boolean insertOrderDetail(long orderId, long userId, CartDTO cartDTO);

    boolean deleteOderDetail(long orderDetailId, long userId);

    OrderDetailDTO getOrderDetailDTO(long orderDetailId);

    List<OrderDetailDTO> getOrderDetailDTOs(int pageNo, int limit);

    List<OrderDetailDTO> getAll();
}
