package com.dev.cellcolthes.domain.service;

import com.dev.cellcolthes.domain.api.OrderDetailService;
import com.dev.cellcolthes.model.dto.CartDTO;
import com.dev.cellcolthes.model.dto.OrderDetailDTO;
import com.dev.cellcolthes.model.entity.OrderDetail;
import com.dev.cellcolthes.repository.OrderDetailRepository;
import com.dev.cellcolthes.utils.mapper.order.OrderDetailMapperImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    private static final Logger logger = LoggerFactory.getLogger(OrderDetailServiceImpl.class);
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public boolean insertOrderDetail(long orderId, long userId, CartDTO cartDTO) {
        return false;
    }

    @Override
    public boolean deleteOderDetail(long orderDetailId, long userId) {
        return false;
    }

    @Override
    public OrderDetailDTO getOrderDetailDTO(long orderDetailId) {
        return null;
    }

    @Override
    public List<OrderDetailDTO> getOrderDetailDTOs(int pageNo, int limit) {
        return null;
    }

    @Override
    public List<OrderDetailDTO> getAll() {
        List<OrderDetail> orderDetailList = orderDetailRepository.findAll();
        return OrderDetailMapperImpl.getInstance().listOrderDetailToListOrderDetailDTo(orderDetailList);
    }
}
