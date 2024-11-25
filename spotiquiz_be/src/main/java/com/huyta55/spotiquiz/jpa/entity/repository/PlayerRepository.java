package com.huyta55.spotiquiz.jpa.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import com.huyta55.spotiquiz.jpa.entity.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    @Transactional
    @Modifying
    @Query(value = "delete from Player p where p.username=:username")
    void deleteByUsername(@Param("username") String username);

    @Query(value = "select p from Player p where p.username=:username")
    Player findByUsername(@Param("username") String username);

    @Query(value = "select p from Player p where p.score=:score")
    List<Player> getAllWithScore(@Param("score") int score);
}
