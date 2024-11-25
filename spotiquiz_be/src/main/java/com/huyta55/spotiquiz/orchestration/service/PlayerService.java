package com.huyta55.spotiquiz.orchestration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huyta55.spotiquiz.jpa.entity.Player;
import com.huyta55.spotiquiz.jpa.entity.repository.PlayerRepository;


@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepo;

    public List<Player> findAll() {
        return playerRepo.findAll();
    }

    public Player findByUsername(String desiredUser) {
        return playerRepo.findByUsername(desiredUser);
    }

    @Transactional
    public Player createPlayer(Player newPlayer) {
        return playerRepo.save(newPlayer);
    }

    @Transactional
    public void deletePlayerByUser(String desiredUser) {
        playerRepo.deleteByUsername(desiredUser);
    }


}
