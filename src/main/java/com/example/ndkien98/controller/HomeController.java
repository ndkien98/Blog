package com.example.ndkien98.controller;

import com.example.ndkien98.Entity.BlogArticle;
import com.example.ndkien98.Repository.IBlogArticleRepo;
import com.example.ndkien98.service.IBlogArticleService;
import com.example.ndkien98.service.impl.BlogArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    IBlogArticleService iBlogArticleService;

    @Autowired
    public HomeController(BlogArticleServiceImpl blogArticleService){
        iBlogArticleService = blogArticleService;
    }

    @PostMapping("/getAll")
    public ResponseEntity<Void> findAll(){
        List<BlogArticle> list =iBlogArticleService.getAll();
        for (BlogArticle b:list
             ) {
            System.out.println(b.toString());
        }
        return ResponseEntity.noContent().build();
    }

}
