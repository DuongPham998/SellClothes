package com.dev.cellcolthes.domain.service;

import com.dev.cellcolthes.domain.api.CategoryService;
import com.dev.cellcolthes.model.dto.CategoryDTO;
import com.dev.cellcolthes.model.entity.Category;
import com.dev.cellcolthes.repository.CategoryRepository;
import com.dev.cellcolthes.utils.mapper.category.CategoryMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private static final CategoryServiceImpl categoryService = new CategoryServiceImpl();
    public static CategoryServiceImpl getInstance() {return categoryService;}
    private CategoryServiceImpl() {}

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public boolean insertCategory(CategoryDTO categoryDTO) {
        if (categoryDTO != null) {
            Category category = CategoryMapperImpl.getInstance().categoryDTOToCategory(categoryDTO);
            categoryRepository.save(category);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCategory(long categoryId, CategoryDTO categoryDTO) {
        Category category = categoryRepository.findCategoryById(categoryId);
        if (category != null)
            return false;
        Category categoryUpdate = CategoryMapperImpl.getInstance().categoryDTOToCategory(categoryDTO);
        if (categoryUpdate != null) {
            categoryRepository.save(categoryUpdate);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCategory(long categoryId) {
        categoryRepository.deleteById(categoryId);
        return true;
    }

    @Override
    public CategoryDTO getCategory(long categoryId) {
        Category category = categoryRepository.findCategoryById(categoryId);
        if (category != null) {
            return CategoryMapperImpl.getInstance().categoryToCategoryDTO(category);
        }
        return null;
    }

    @Override
    public List<CategoryDTO> getCategories() {
        List<Category> categories = categoryRepository.findAll();
        if (!categories.isEmpty()) {
            return CategoryMapperImpl.getInstance().listCategoryToListCategoryDTO(categories);
        }
        return Collections.emptyList();
    }
}
