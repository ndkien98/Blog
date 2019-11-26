package com.example.ndkien98.DTO;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AuthorDTO {
    private int id;
    private String firt_name;
    private String last_name;
    Set<Integer> listBlog;

    public AuthorDTO() {
        listBlog = new HashSet<Integer>();
    }
}
