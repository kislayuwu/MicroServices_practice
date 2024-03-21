package com.bridgelabz.quiz.service;

import com.bridgelabz.quiz.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082" ,value="Question-Client")
public interface QuestionClient {
    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable long quizId);

}
