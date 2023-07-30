package com.dev.cellcolthes.utils.mapper.category;

import com.dev.cellcolthes.model.dto.CategoryDTO;
import com.dev.cellcolthes.model.entity.Category;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CategoryMapperImpl implements CategoryMapper {
    private static final CategoryMapperImpl categoryMapper = new CategoryMapperImpl();
    public static CategoryMapperImpl getInstance() {return categoryMapper; }
    private CategoryMapperImpl() {}

    @Override
    public Category categoryDTOToCategory(CategoryDTO categoryDTO) {
        if (categoryDTO != null)
            return new Category(
                    categoryDTO.getId(),
                    categoryDTO.getCategoryName(),
                    categoryDTO.getDescription(),
                    categoryDTO.getStatus(),
                    categoryDTO.getStatus(),
                    categoryDTO.getCategoryOrder()
            );
        return null;
    }

    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if (category != null)
            return new CategoryDTO(
                    category.getId(),
                    category.getCategoryName(),
                    category.getDescription(),
                    category.getCategoryParent(),
                    category.getStatus(),
                    category.getCategoryOrder()
            );
        return null;
    }

    @Override
    public List<CategoryDTO> listCategoryToListCategoryDTO(List<Category> categoryList) {
        if (categoryList != null && !categoryList.isEmpty()) {
            List<CategoryDTO> categoryDTOList = new ArrayList<>();
            for (Category category : categoryList) {
                categoryDTOList.add(categoryToCategoryDTO(category));
            }
            return categoryDTOList;
        }
        return Collections.emptyList();
    }
}
