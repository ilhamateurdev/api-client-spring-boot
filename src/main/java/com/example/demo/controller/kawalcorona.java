package com.example.demo.controller;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class kawalcorona {

    @GetMapping("/")
    public ResponseEntity<?> all() throws UnirestException {

        HttpResponse<String> response = Unirest.get("https://api.kawalcorona.com/")
                .asString();

        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);

    }

    @GetMapping("/indonesia")
    public ResponseEntity<?> indonesia() throws UnirestException {

        HttpResponse<String> response = Unirest.get("https://api.kawalcorona.com/indonesia")
                .asString();

        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }

    @GetMapping("/indonesia/provinsi")
    public ResponseEntity<?> provinsi() throws UnirestException {

        HttpResponse<String> response = Unirest.get("https://api.kawalcorona.com/indonesia/provinsi")
                .asString();

        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }

    @GetMapping("/positif")
    public ResponseEntity<?> positif() throws UnirestException {

        HttpResponse<String> response = Unirest.get("https://api.kawalcorona.com/positif")
                .asString();

        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }

    @GetMapping("/sembuh")
    public ResponseEntity<?> sembuh() throws UnirestException {

        HttpResponse<String> response = Unirest.get("https://api.kawalcorona.com/sembuh")
                .asString();

        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }

    @GetMapping("/meninggal")
    public ResponseEntity<?> meninggal() throws UnirestException {

        HttpResponse<String> response = Unirest.get("https://api.kawalcorona.com/meninggal")
                .asString();

        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }

}
