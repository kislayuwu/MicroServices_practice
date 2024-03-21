package com.bridgelabz.quiz.repository;

import com.bridgelabz.quiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Quiz,Integer> {
    Quiz findById(Long id);
}
