package com.example.ndkien98.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question")
@Getter
@Setter
@NoArgsConstructor
public class Question {

    private static final long serialVersionUID = 1L;

    public Question(Long id) {
        super();
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "level_id")
    private int level;

    @ManyToMany(mappedBy = "listQuestion")
    private List<Test> testList = new ArrayList<>();

}
