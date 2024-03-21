package com.bridgelabz.questionservice.controller;

import com.bridgelabz.questionservice.model.Question;
import com.bridgelabz.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }
    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }
    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id){
        return questionService.getOne(id);
    }

    //get all questions of a quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }

}
