package com.bridgelabz.quiz.controller;

import com.bridgelabz.quiz.model.Question;
import com.bridgelabz.quiz.model.Quiz;
import com.bridgelabz.quiz.service.QuizServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizServiceInterface quizService;

    public QuizController(QuizServiceInterface quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz) {
        return quizService.add(quiz);
    }
    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }
    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);
    }

//    @GetMapping("/quiz/{quizId}")
//    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId) {
//        return quizService.getQuestionsOfQuiz(quizId);
//    }

}
