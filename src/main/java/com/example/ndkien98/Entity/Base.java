package com.example.ndkien98.Entity;


import javax.persistence.*;

@MappedSuperclass
public class Base {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                '}';
    }
}
