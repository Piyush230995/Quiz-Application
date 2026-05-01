package com.Quiz.Quizapp.dao;

import com.Quiz.Quizapp.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions, Integer> {

    List<Questions>findQuestionByCategory(String category);
}
