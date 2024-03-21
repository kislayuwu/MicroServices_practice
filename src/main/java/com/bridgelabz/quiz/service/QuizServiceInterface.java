package com.bridgelabz.quiz.service;

import com.bridgelabz.quiz.model.Quiz;

import java.util.List;

public interface QuizServiceInterface {
    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
