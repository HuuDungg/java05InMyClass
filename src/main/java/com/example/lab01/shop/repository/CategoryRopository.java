package com.example.lab01.shop.repository;

import com.example.lab01.shop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRopository extends JpaRepository<Category,String> {

}

