package com.example.ndkien98.Repository;

import com.example.ndkien98.Entity.BlogArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface IBlogArticleRepo extends JpaRepository<BlogArticle,Integer> {

}
