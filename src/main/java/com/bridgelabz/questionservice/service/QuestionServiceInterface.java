package com.bridgelabz.questionservice.service;

import com.bridgelabz.questionservice.model.Question;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface QuestionServiceInterface {
    Question create(@RequestBody Question question);

    List<Question> get();

    Question getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
