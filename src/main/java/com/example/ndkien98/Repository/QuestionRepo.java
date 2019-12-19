package com.example.ndkien98.Repository;

import com.example.ndkien98.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,Long> {
}
