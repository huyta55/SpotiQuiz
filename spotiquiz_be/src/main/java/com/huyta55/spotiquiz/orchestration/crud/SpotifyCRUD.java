package com.huyta55.spotiquiz.orchestration.crud;


import java.util.HashMap;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.huyta55.spotiquiz.orchestration.config.SpotifyConfig;


@Component
public class SpotifyCRUD {

    private static final Logger logger = LoggerFactory.getLogger(SpotifyCRUD.class);

    @Autowired
    private RestClient restClient;

    private final SpotifyConfig spotifyConfig;

    @Autowired
    public SpotifyCRUD(SpotifyConfig theSpotifyConfig) {
        spotifyConfig = theSpotifyConfig;
    }


    public String getSpotifyAccessToken() {
        String url = "https://accounts.spotify.com/api/token";
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded");

        StringBuilder requestBody = new StringBuilder();
        requestBody.append("\"grant_type\":\"client_credentials\"");
        requestBody.append("client_id=").append(spotifyConfig.getClientId());
        requestBody.append("client_secret").append(spotifyConfig.getClientSecret());

        return callRestClient(url, headers, requestBody.toString());

    }

    private String callRestClient(String url, Map<String, String> headers, String requestBody) {
        String response = null;
        try {
            logger.debug("Calling Spring Web Client....");
            ResponseEntity<String> apiResponse = restClient.makeApiCallWithParams(url, requestBody, headers);

            if (apiResponse.hasBody()) {
                response = apiResponse.getBody();
            }
        } catch (Exception e) {
            logger.error("An error occurred while trying to call the REST client: ", e);
        }

        return response;
    }
}
