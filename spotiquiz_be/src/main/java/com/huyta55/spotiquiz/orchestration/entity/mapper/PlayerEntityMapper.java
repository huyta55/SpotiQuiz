package com.huyta55.spotiquiz.orchestration.entity.mapper;

import org.springframework.stereotype.Component;

import com.huyta55.spotiquiz.jpa.entity.Player;
import com.huyta55.generic.entity.PlayerImport;

@Component
public class PlayerEntityMapper {

    public Player mapPlayerToEntity(PlayerImport playerImport) {
        Player newPlayer = new Player();
        newPlayer.setUsername(playerImport.getUsername());
        newPlayer.setEmail(playerImport.getEmail());
        newPlayer.setScore(playerImport.getScore());
        newPlayer.setHighScore(playerImport.getHighScore());
        newPlayer.setUserPassword(playerImport.getPassword());
        newPlayer.setDmIndicator(playerImport.isDarkModeEnabled());

        return newPlayer;
    }
}
