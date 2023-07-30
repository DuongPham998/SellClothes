package com.dev.cellcolthes.domain.service;

import com.dev.cellcolthes.domain.api.OrderDetailService;
import com.dev.cellcolthes.domain.api.OrderService;
import com.dev.cellcolthes.domain.api.ProductService;
import com.dev.cellcolthes.model.dto.CartDTO;
import com.dev.cellcolthes.model.dto.OrderDTO;
import com.dev.cellcolthes.model.dto.OrderDetailDTO;
import com.dev.cellcolthes.model.entity.Order;
import com.dev.cellcolthes.model.entity.OrderDetail;
import com.dev.cellcolthes.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Autowired
    OrderRepository orderRepository;
    private static final OrderDetailService orderDetailService = new OrderDetailServiceImpl();
    @Override
    public boolean insertOder(List<CartDTO> cartDTOS, long userId, String phone, String fullName, String shipAddress) {
        if (cartDTOS != null && !cartDTOS.isEmpty()) {
            double totalAmount = 0L;
            for (CartDTO cartDTO : cartDTOS) {
                totalAmount += cartDTO.getTotalAmount();
            }
            Order order = new Order(userId, fullName, phone, shipAddress, totalAmount, System.currentTimeMillis(), System.currentTimeMillis(), 0);
            Order orderDb = orderRepository.save(order);
            // insert order detail
            for (CartDTO cartDTO : cartDTOS) {
                boolean insertOrderDetailCheck = orderDetailService.insertOrderDetail(orderDb.getId(), userId, cartDTO);
                if (!insertOrderDetailCheck) {
                    logger.error("can not insert order detail : " + cartDTO);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean updateOrder(List<CartDTO> cartDTOS, long orderId, long userId, String phone, String fullName, String shipAddress) {
        return false;
    }

    @Override
    public boolean orderDeleteOrder(long orderId, long userId) {
        Order order = orderRepository.findOrderByIdAndUserId(orderId, orderId);
        if (order != null) {
            List<OrderDetailDTO> orderDetailList = orderDetailService.getAll();
            if (orderDetailList != null && !orderDetailList.isEmpty()) {
                for (OrderDetailDTO orderDetailDTO : orderDetailList) {
                    orderDetailService.deleteOderDetail(orderDetailDTO.getId(), userId);
                }
            }
            orderRepository.deleteById(orderId);
            return true;
        }
        return false;
    }

    @Override
    public List<OrderDTO> getOrders(long userId, int pageSize, int pageNo) {
        return null;
    }
}
