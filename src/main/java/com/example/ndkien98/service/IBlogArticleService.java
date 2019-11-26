package com.example.ndkien98.service;


import com.example.ndkien98.Entity.BlogArticle;

import java.util.List;

public interface IBlogArticleService {

    void insert(BlogArticle blogArticle);
    List<BlogArticle> getAll();
}
