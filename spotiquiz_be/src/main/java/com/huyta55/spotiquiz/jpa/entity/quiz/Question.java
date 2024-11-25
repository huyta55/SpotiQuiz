package com.huyta55.spotiquiz.jpa.entity.quiz;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="question")
public class Question {

    @Id
    @Column(name="question_id")
    private String questionId;

    @Column(name="question_text")
    private String questionText;

    @Column(name="correct_answer")
    private String correctAnswer;

    @Column(name="question_type")
    private String questionType;

    @Column(name="artist")
    private String artist;

    @Column(name="album")
    private String album;

    @Column(name="song")
    private String song;
}
