package com.example.ndkien98.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogArticleDTO {

    private int id;
    private Date create_date;
    private Date modifile_date;
    private String name;
    private String category ;
    private String author;
    private String tags;
    private Set<Integer> listAuthor;

    public BlogArticleDTO() {
        listAuthor = new HashSet<>();
    }


}
