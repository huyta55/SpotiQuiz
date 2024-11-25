package com.huyta55.spotiquiz.jpa.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.huyta55.spotiquiz.jpa.entity.quiz.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, String> {
}
