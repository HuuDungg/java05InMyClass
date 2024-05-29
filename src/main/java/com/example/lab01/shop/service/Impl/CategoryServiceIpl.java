package com.example.lab01.shop.service.Impl;

import com.example.lab01.shop.model.Category;
import com.example.lab01.shop.repository.CategoryRopository;
import com.example.lab01.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceIpl implements CategoryService {
    @Autowired
    CategoryRopository categoryRopository;
    @Override
    public List<Category> getAllCategory(){
        return categoryRopository.findAll();
    }

    @Override
    public void addCategory(Category category) {
        categoryRopository.save(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRopository.save(category);
    }

    @Override
    public void deleteCategory(String id) {
        categoryRopository.delete(findById(id));
    }

    @Override
    public Category findById(String id) {
        return categoryRopository.findById(id).get();
    }
}
