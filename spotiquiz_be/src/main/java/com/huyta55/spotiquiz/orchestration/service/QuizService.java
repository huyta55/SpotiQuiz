package com.huyta55.spotiquiz.orchestration.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huyta55.spotiquiz.jpa.entity.quiz.Quiz;
import com.huyta55.spotiquiz.jpa.entity.Player;
import com.huyta55.spotiquiz.jpa.entity.repository.QuizRepository;
import com.huyta55.spotiquiz.jpa.entity.repository.QuestionRepository;


@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepo;

    @Autowired
    private QuestionRepository questionRepo;

    @Transactional
    public Quiz createQuiz(Player player) {
        Quiz newQuiz = new Quiz();
        newQuiz.setPlayer(player);
        newQuiz.setQuizId(generateQuizId(player));
        newQuiz.setTimeStarted(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        quizRepo.save(newQuiz);

        return newQuiz;
    }

    private String generateQuizId(Player player) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd-HH:mm:ss");
        String dateTime = LocalDateTime.now().format(formatter);
        return player.getUsername() + "_" + dateTime;
    }

}
