package com.dev.cellcolthes.utils.mapper.category;

import com.dev.cellcolthes.model.dto.CategoryDTO;
import com.dev.cellcolthes.model.entity.Category;

import java.util.List;

public interface CategoryMapper {
    Category categoryDTOToCategory(CategoryDTO categoryDTO);

    CategoryDTO categoryToCategoryDTO(Category category);

    List<CategoryDTO> listCategoryToListCategoryDTO(List<Category> categoryList);
}
