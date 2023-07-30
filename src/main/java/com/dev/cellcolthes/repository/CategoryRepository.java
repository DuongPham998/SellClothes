package com.dev.cellcolthes.repository;

import com.dev.cellcolthes.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findCategoryById(long categoryId);
}
