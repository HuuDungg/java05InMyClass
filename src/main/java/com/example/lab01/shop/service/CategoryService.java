package com.example.lab01.shop.service;

import com.example.lab01.shop.model.Category;


import java.util.List;

public interface CategoryService {
     List<Category> getAllCategory();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(String id);
    Category findById(String id);

}
