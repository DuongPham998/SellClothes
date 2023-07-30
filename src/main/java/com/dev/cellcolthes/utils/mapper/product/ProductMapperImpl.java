package com.dev.cellcolthes.utils.mapper.product;

import com.dev.cellcolthes.model.dto.ProductDTO;
import com.dev.cellcolthes.model.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMapperImpl implements ProductMapper {
    private static final ProductMapperImpl productMapper = new ProductMapperImpl();
    public static ProductMapperImpl getInstance() {return productMapper;}
    private ProductMapperImpl() {}

    @Override
    public Product productDTOToProduct(ProductDTO productDTO) {
        if (productDTO != null)
            return new Product(
                    productDTO.getId(),
                    productDTO.getProductName(),
                    productDTO.getPrice(),
                    productDTO.getDescription(),
                    productDTO.getImage(),
                    productDTO.getCategoryName(),
                    productDTO.getQuantity(),
                    productDTO.getStatus(),
                    productDTO.getCreateDate(),
                    productDTO.getUpdateDate()
            );
        return null;
    }

    @Override
    public ProductDTO productToProductDTO(Product product) {
        if (product != null)
            return new ProductDTO(
                    product.getId(),
                    product.getProductName(),
                    product.getPrice(),
                    product.getDescription(),
                    product.getImage(),
                    product.getCategoryName(),
                    product.getQuantity(),
                    product.getStatus(),
                    product.getCreateDate(),
                    product.getUpdateDate()
            );
        return null;
    }

    @Override
    public List<ProductDTO> listProductToListProductDTO(List<Product> products) {
        if (products != null && !products.isEmpty()) {
            List<ProductDTO> productDTOList = new ArrayList<>();
            for (Product product : products) {
                productDTOList.add(productToProductDTO(product));
            }
            return productDTOList;
        }
        return Collections.emptyList();
    }
}
