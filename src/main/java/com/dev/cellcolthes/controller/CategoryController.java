package com.dev.cellcolthes.controller;

import com.dev.cellcolthes.domain.api.CategoryService;
import com.dev.cellcolthes.model.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("categories")
    public List<CategoryDTO> getCategories() {
        return categoryService.getCategories();
    }

    @PostMapping("categories")
    public boolean insertCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.insertCategory(categoryDTO);
    }

    @GetMapping("category/{id}")
    public CategoryDTO getCategory(@PathVariable("id") long categoryId) {
        return categoryService.getCategory(categoryId);
    }

    @PutMapping("category/{id}")
    public boolean updateCategory(@PathVariable("id") long categoryId, @RequestBody CategoryDTO categoryDTO) {
        return categoryService.updateCategory(categoryId, categoryDTO);
    }
}
