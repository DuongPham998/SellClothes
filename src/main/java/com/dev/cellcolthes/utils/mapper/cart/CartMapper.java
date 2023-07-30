package com.dev.cellcolthes.utils.mapper.cart;

import com.dev.cellcolthes.model.dto.CartDTO;
import com.dev.cellcolthes.model.entity.Cart;

import java.util.List;

public interface CartMapper {
    CartDTO cartToCartDTO(Cart cart);

    Cart cartDTOToCart(CartDTO cartDTO);

    List<CartDTO> listCartToListCartDTO(List<Cart> carts);
}
