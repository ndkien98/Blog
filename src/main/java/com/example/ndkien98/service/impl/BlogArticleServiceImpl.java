package com.example.ndkien98.service.impl;

import com.example.ndkien98.Entity.BlogArticle;
import com.example.ndkien98.Repository.IBlogArticleRepo;
import com.example.ndkien98.service.IBlogArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogArticleServiceImpl implements IBlogArticleService {

    IBlogArticleRepo iBlogArticleRepo;

    @Autowired
    public BlogArticleServiceImpl(IBlogArticleRepo IBlogArticleRepo){
        iBlogArticleRepo = IBlogArticleRepo;
    }



    @Override
    public void insert(BlogArticle blogArticle) {

    }

    @Override
    public List<BlogArticle> getAll() {
        return iBlogArticleRepo.findAll();
    }



}
