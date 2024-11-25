package com.huyta55.spotiquiz.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="player")
public class Player {

    @Id
    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="score")
    private Integer score = 0;

    @Column(name="high_score")
    private Integer highScore = 0;

    @Column(name="user_pswd")
    private String userPassword;

    @Column(name="dm_indicator")
    private Boolean dmIndicator = false;


    public Player() {
    }

    public Player(String username, String email, Integer score, Integer highScore, String passwd, Boolean dmIndicator) {
        this.username = username;
        this.email = email;
        this.score = score;
        this.highScore = highScore;
        this.userPassword = passwd;
        this.dmIndicator = dmIndicator;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", score=" + score +
                ", highScore=" + highScore +
                '}';
    }
}
