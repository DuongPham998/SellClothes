package com.dev.cellcolthes.utils.mapper.cart;

import com.dev.cellcolthes.model.dto.CartDTO;
import com.dev.cellcolthes.model.entity.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartMapperImpl implements CartMapper {
    private static final CartMapperImpl cartMapperImpl = new CartMapperImpl();
    public static CartMapperImpl getInstance() {return cartMapperImpl;}
    private CartMapperImpl() {}
    @Override
    public CartDTO cartToCartDTO(Cart cart) {
        if (cart != null)
            return new CartDTO (
                    cart.getId(),
                    cart.getProductId(),
                    cart.getProductName(),
                    cart.getQuantity(),
                    cart.getTotalAmount()
            );
        return null;
    }

    @Override
    public Cart cartDTOToCart(CartDTO cartDTO) {
        if (cartDTO != null)
            return new Cart (
                    cartDTO.getId(),
                    cartDTO.getProductId(),
                    cartDTO.getProductName(),
                    cartDTO.getQuantity(),
                    cartDTO.getTotalAmount()
            );
        return null;
    }

    @Override
    public List<CartDTO> listCartToListCartDTO(List<Cart> carts) {
        if (carts != null && !carts.isEmpty()) {
            List<CartDTO> cartDtoList = new ArrayList<>();
            for (Cart cart : carts) {
                cartDtoList.add(cartToCartDTO(cart));
            }
            return cartDtoList;
        }
        return null;
    }
}
