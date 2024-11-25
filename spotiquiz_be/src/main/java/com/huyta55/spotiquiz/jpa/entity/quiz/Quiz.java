package com.huyta55.spotiquiz.jpa.entity.quiz;

import jakarta.persistence.*;
import lombok.Data;

import com.huyta55.spotiquiz.jpa.entity.Player;


@Data
@Entity
@Table(name="quiz")
public class Quiz {

    @Id
    @Column(name="quiz_id")
    private String quizId;

    @ManyToOne
    @JoinColumn(name="player", referencedColumnName="username")
    private Player player;

    @Column(name="questions_attempted")
    private Integer questionsAttempted = 0;

    @Column(name="questions_correct")
    private Integer correctAnswers = 0;

    @Column(name="time_taken")
    private String timeTaken;

    @Column(name="time_started")
    private String timeStarted;

}
