package com.papuzki.papuchaservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.papuzki.papuchaservice.model.Papuga;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

    @Service
    public class BorbService {

//        @Value("${currency.url}")
        private String url;
        private final RestTemplate rest = new RestTemplate();
        private final static ObjectMapper mapper = new ObjectMapper();


        public ResponseEntity<String> post(String papuga) {
            if (papuga == null || papuga == "") {
                throw new IllegalArgumentException();
            }

            HttpEntity<String> requestEntity = new HttpEntity<>("");
            ResponseEntity<String> responseEntity = rest.exchange(url + "/?format=json",
                    HttpMethod.POST,
                    requestEntity,
                    String.class);

            return responseEntity;
        }

        public Papuga createBorbObject(ResponseEntity<String> entity) throws JsonProcessingException {
            if (entity == null) {
                throw new IllegalArgumentException();
            }
            return mapper.readValue(entity.getBody(), Papuga.class);
        }
    }
