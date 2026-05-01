package com.Quiz.Quizapp.dao;

import com.Quiz.Quizapp.Model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions, Integer> {

    List<Questions>findQuestionByCategory(String category);

    @Query(value = "SELECT * FROM questions q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQ;",  nativeQuery = true)
    List<Questions> findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);
}
