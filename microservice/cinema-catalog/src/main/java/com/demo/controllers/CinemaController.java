package com.demo.controllers;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;

import com.demo.model.Cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CinemaController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/shows")
    public List<Cinema> getAllMovies(){

        String url = "http://MOVIE-SERVICE/v1/api/movies";

        HttpMethod method = HttpMethod.GET;

        HttpHeaders headers = null;
        HttpEntity<?> entity = new HttpEntity(null, headers);

        ResponseEntity<List<Cinema>> resEntity = restTemplate.exchange(url, method, entity, new ParameterizedTypeReference<List<Cinema>>() {});

        System.out.println(resEntity.getStatusCode());

        return resEntity.getBody();
    }
    
}