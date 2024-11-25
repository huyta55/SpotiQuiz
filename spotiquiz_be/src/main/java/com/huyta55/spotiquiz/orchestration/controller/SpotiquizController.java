package com.huyta55.spotiquiz.orchestration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huyta55.spotiquiz.orchestration.service.SpotifyService;


@RestController
@RequestMapping("api/")
public class SpotiquizController {

    private static final Logger logger = LoggerFactory.getLogger(SpotiquizController.class);

    @Autowired
    SpotifyService spotifyService;


    @GetMapping("health/")
    public ResponseEntity<Void> getAPIHealth() {
        logger.debug("API Health = OK.");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("spotify/access/")
    public ResponseEntity<String> getSpotifyAccessToken() {
        logger.debug("Controller - Getting Spotify Access Token...");
        return new ResponseEntity<>(spotifyService.getSpotifyAccessToken(), HttpStatus.OK);
    }


}
