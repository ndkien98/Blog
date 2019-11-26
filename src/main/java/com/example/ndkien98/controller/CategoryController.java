package com.example.ndkien98.controller;

import com.example.ndkien98.DTO.CategoryDTO;
import com.example.ndkien98.Entity.Category;
import com.example.ndkien98.service.ICategoryService;
import com.example.ndkien98.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CategoryController {

    ICategoryService categoryService;

    @Autowired
    public CategoryController(CategoryServiceImpl service){
        categoryService =service;
    }

    @PostMapping("/category-insert")
    public ResponseEntity<Category> insert(@Valid @RequestBody CategoryDTO categoryDTO){
        categoryService.insert(categoryDTO);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<Category> getAll(){
        List<Category> list = categoryService.getAll();
        for (Category c:list
             ) {
            System.out.println(c.toString());
        }
        return ResponseEntity.noContent().build();
    }

}
