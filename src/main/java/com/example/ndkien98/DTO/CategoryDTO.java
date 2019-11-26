package com.example.ndkien98.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    private int id;
    private String name;
    Set<Integer> listBlog;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public CategoryDTO(){
        listBlog = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Integer> getListBlog() {
        return listBlog;
    }

    public void setListBlog(Set<Integer> listBlog) {
        this.listBlog = listBlog;
    }
}
