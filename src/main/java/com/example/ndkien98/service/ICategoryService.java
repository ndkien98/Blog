package com.example.ndkien98.service;

import com.example.ndkien98.DTO.CategoryDTO;
import com.example.ndkien98.Entity.Category;


import java.util.List;

public interface ICategoryService {

    public List<Category> getAll();
    public CategoryDTO findById(int id);
    public void insert(CategoryDTO categoryDTO);
    public void delete(Long id);


}
