package com.dev.cellcolthes.domain.service;

import com.dev.cellcolthes.domain.api.ProductService;
import com.dev.cellcolthes.model.dto.ProductDTO;
import com.dev.cellcolthes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public boolean insertProduct(ProductDTO productDTO) {
        return false;
    }

    @Override
    public boolean updateProduct(long productId, ProductDTO productDTO) {
        return false;
    }

    @Override
    public boolean deleteProduct(long productId) {
        return false;
    }

    @Override
    public ProductDTO getProduct(long productId) {
        return null;
    }

    @Override
    public List<ProductDTO> getProducts(int pageSize, int pageNo) {
        return null;
    }
}
