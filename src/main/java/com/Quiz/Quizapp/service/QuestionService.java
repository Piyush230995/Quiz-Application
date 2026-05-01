package com.Quiz.Quizapp.service;


import com.Quiz.Quizapp.Questions;
import com.Quiz.Quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Questions>> getAllQuestions() {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);

    }

    public ResponseEntity<List<Questions>> getQuestionsByCategory(String category) {
            return new ResponseEntity<>(questionDao.findQuestionByCategory(category), HttpStatus.OK);

    }

    public ResponseEntity<String> addQuestion(Questions question) {
        questionDao.save(question);
        return new ResponseEntity<>("Question added successfully", HttpStatus.CREATED);
    }
}
