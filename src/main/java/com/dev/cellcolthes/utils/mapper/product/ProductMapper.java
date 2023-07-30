package com.dev.cellcolthes.utils.mapper.product;

import com.dev.cellcolthes.model.dto.ProductDTO;
import com.dev.cellcolthes.model.entity.Product;

import java.util.List;

public interface ProductMapper {
    Product productDTOToProduct(ProductDTO productDTO);

    ProductDTO productToProductDTO(Product product);

    List<ProductDTO> listProductToListProductDTO(List<Product> products);
}
