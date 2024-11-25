package com.huyta55.spotiquiz.orchestration.crud;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;




@Component
@Configuration
public class RestClient {

    private static final Logger logger = LoggerFactory.getLogger(RestClient.class);

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    private final RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> makeApiCallWithParams(String url, String requestBody, Map<String, String> headers) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAll(headers);
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, httpHeaders);

        return restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
    }



}
