package com.example.ndkien98.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogArticle extends Base {

    @Column(name = "name" , columnDefinition = "varchar(30)")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_FOREIGN_KEY")
    private Category category;

    @ManyToMany(mappedBy = "articles") // tro toi tap hop bai viet trong author
    private Collection<Author> authors ;

    @Column(name = "modifileDate")
    private Date modifileDate;

    @Column(name = "createDate")
    private Date createDate;

    public BlogArticle() {
        authors = new HashSet<>();
    }

    @Override
    public String toString() {
        return "BlogArticle{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", authors="  +
                ", modifileDate=" + modifileDate +
                ", createDate=" + createDate +
                '}';
    }
}
