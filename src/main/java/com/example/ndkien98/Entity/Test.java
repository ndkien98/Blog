package com.example.ndkien98.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name="test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "nvarchar(100)")
    private String name;

    @Column(name="level")
    private int level ;


    @ManyToMany
    @JoinTable(name = "Test_Question",
            joinColumns = @JoinColumn(name = "test_id" , referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "question_id",referencedColumnName = "id")
    )
    private List<Question> listQuestion = new ArrayList<>();


}