package com.example.lab01.shop.controller;

import com.example.lab01.shop.model.Category;
import com.example.lab01.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/shop/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("list",categoryService.getAllCategory());
        return "shop/category";
    }

    @PostMapping("/add")
    public String addCategory(Category category){
        categoryService.addCategory(category);
        return "redirect:/shop/category/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategory(@PathVariable("id")String id){
        categoryService.deleteCategory(id);
        return "redirect:/shop/category/list";
    }

    @GetMapping("/detail/{id}")
    public String detaiCategory(@PathVariable("id") String id, Model model){
        Category category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "shop/categoryDetail";
    }

    @PostMapping("/update")
    public String updateCategory(@ModelAttribute("category") Category category){
        categoryService.updateCategory(category);
        return "redirect:/shop/category/list";
    }


}
