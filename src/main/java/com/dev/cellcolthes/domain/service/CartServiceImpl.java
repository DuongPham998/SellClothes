package com.dev.cellcolthes.domain.service;

import com.dev.cellcolthes.domain.api.CartService;
import com.dev.cellcolthes.model.dto.CartDTO;
import com.dev.cellcolthes.model.entity.Cart;
import com.dev.cellcolthes.repository.CartRepository;
import com.dev.cellcolthes.utils.mapper.cart.CartMapper;
import com.dev.cellcolthes.utils.mapper.cart.CartMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private static final CartMapper cartMapper = CartMapperImpl.getInstance();
    @Autowired
    CartRepository cartRepository;

    @Override
    public boolean insertCart(CartDTO cartDTO) {
        Cart cart = cartMapper.cartDTOToCart(cartDTO);
        if (cart != null) {
            cartRepository.save(cart);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCart(long cartId, CartDTO cartDTO) {
        return false;
    }

    @Override
    public boolean deleteCart(long cartId) {
        return false;
    }

    @Override
    public List<CartDTO> getCarts(int pageSize, int pageNo) {
        return null;
    }
}
