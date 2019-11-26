package com.example.ndkien98.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Category extends Base {

    @Column(name = "name" , columnDefinition = "varchar(50)")
    private String name;


    @OneToMany(mappedBy = "category") //tro toi bien category_id trong blog
    private Collection<BlogArticle> blogArticles;

    public Category() {
        blogArticles = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<BlogArticle> getBlogArticles() {
        return blogArticles;
    }

    public void setBlogArticles(Collection<BlogArticle> blogArticles) {
        this.blogArticles = blogArticles;
    }

    @Override
    public String toString() {
        super.toString();
        return "Category{" +
                "name='" + name + '\'' +
                ", blogArticles=" + blogArticles +
                '}';
    }
}
