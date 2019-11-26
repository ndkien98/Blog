package com.example.ndkien98.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Author extends Base {

    @Column(name = "firt_name" , columnDefinition = "nvarchar(20)")
    private String firt_name;

    @Column(name = "last_name",columnDefinition = "nvarchar(20)")
    private String last_name;


    @ManyToMany // tao ra quan he n-n voi blogArticle
    @JoinTable(name = "author_blogArticle" // tao ra bang phu
                ,joinColumns = @JoinColumn(name = "author_id") // Khoa ngoai tro toi class hien tai
                ,inverseJoinColumns = @JoinColumn(name = "blog_id") // khoa ngoai tro toi class blog
    )
    private Collection<BlogArticle> articles;

    public Author() {
        articles = new HashSet<>();
    }
}
