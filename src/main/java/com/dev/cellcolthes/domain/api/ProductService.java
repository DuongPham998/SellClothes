package com.dev.cellcolthes.domain.api;

import com.dev.cellcolthes.model.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    boolean insertProduct(ProductDTO productDTO);

    boolean updateProduct(long productId, ProductDTO productDTO);

    boolean deleteProduct(long productId);

    ProductDTO getProduct(long productId);

    List<ProductDTO> getProducts(int pageSize, int pageNo);
}
