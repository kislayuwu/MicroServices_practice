package com.bridgelabz.questionservice.service;

import com.bridgelabz.questionservice.model.Question;
import com.bridgelabz.questionservice.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService implements QuestionServiceInterface {

    @Autowired
    QuestionRepository questionRepository;


    @Override
    public Question create(Question question){
        return questionRepository.save(question);
    }
    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found !!"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }


}
