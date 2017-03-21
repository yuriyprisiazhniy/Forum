package com.yupr.forum.dao;

import com.yupr.forum.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryDataRepository {
    Category createCategory(Category categoryData);
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Integer id);
    Optional<Category> updateCategory(Integer id, Category categoryData);
}
