package com.example.ndkien98.Repository;

import com.example.ndkien98.DTO.CategoryDTO;
import com.example.ndkien98.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface ICategoryRepo extends JpaRepository<Category,Integer> {




}
