package com.dev.cellcolthes.domain.api;

import com.dev.cellcolthes.model.dto.CartDTO;

import java.util.List;

public interface CartService {
    boolean insertCart(CartDTO cartDTO);

    boolean updateCart(long cartId, CartDTO cartDTO);

    boolean deleteCart(long cartId);

    List<CartDTO> getCarts(int pageSize, int pageNo);
}
