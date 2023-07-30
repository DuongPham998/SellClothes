package com.dev.cellcolthes.domain.api;

import com.dev.cellcolthes.model.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    boolean insertCategory(CategoryDTO categoryDTO);

    boolean updateCategory(long categoryId, CategoryDTO categoryDTO);

    boolean deleteCategory(long categoryId);

    CategoryDTO getCategory(long categoryId);

    List<CategoryDTO> getCategories();
}
