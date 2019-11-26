package com.example.ndkien98.service.impl;

import com.example.ndkien98.DTO.CategoryDTO;
import com.example.ndkien98.Entity.BlogArticle;
import com.example.ndkien98.Entity.Category;
import com.example.ndkien98.Repository.IBlogArticleRepo;
import com.example.ndkien98.Repository.ICategoryRepo;
import com.example.ndkien98.service.ICategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CategoryServiceImpl implements ICategoryService {

    private ICategoryRepo iCategoryRepo;
    private IBlogArticleRepo iBlogArticleRepo;

    @Autowired
    public CategoryServiceImpl(ICategoryRepo categoryRepo,IBlogArticleRepo iBlogArticleRepo){
        this.iCategoryRepo = categoryRepo;
        this.iBlogArticleRepo = iBlogArticleRepo;
    }

    @Override
    public List<Category> getAll() {
        return iCategoryRepo.findAll();
    }

    @Override
    public CategoryDTO findById(int id) {
        return null;
    }

    @Override
    public void insert(CategoryDTO categoryDTO) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDTO,category);
        Set<BlogArticle> listBlog = new HashSet<>();
        for(Integer id: categoryDTO.getListBlog()){
            BlogArticle blogArticle = iBlogArticleRepo.getOne(id);
            listBlog.add(blogArticle);
        }
        category.setBlogArticles(listBlog);
        iCategoryRepo.save(category);
    }

    @Override
    public void delete(Long id) {
        iCategoryRepo.deleteById(Math.toIntExact(id));
    }
}
