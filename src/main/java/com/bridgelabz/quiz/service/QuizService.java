package com.bridgelabz.quiz.service;

import com.bridgelabz.quiz.model.Quiz;
import com.bridgelabz.quiz.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService implements QuizServiceInterface {

    @Autowired
    Repository quizRepository;
    @Autowired
    QuestionClient questionClient;

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }
    @Override
    public List<Quiz> get() {

        List<Quiz> quizzes=quizRepository.findAll();

        quizzes.stream().map( quiz -> {
            quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

        return quizzes;
    }
    @Override
    public Quiz get(Long id) {
        Quiz quiz = quizRepository.findById(id);
        quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
        return quiz;
    }
}
