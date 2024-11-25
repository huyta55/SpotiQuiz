package com.huyta55.spotiquiz.orchestration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huyta55.spotiquiz.orchestration.crud.SpotifyCRUD;


@Service
public class SpotifyService {

    @Autowired
    SpotifyCRUD spotifyCRUD;

    private String spotifyAccessToken;

    public String getSpotifyAccessToken() {
        spotifyAccessToken = spotifyCRUD.getSpotifyAccessToken();
        return spotifyAccessToken;
    }

}
