package com.sparta.sakila.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.sakila.entities.Actor;
import com.sparta.sakila.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SakilaController {
    @Autowired
    private ActorRepository repo;
    @Autowired
    private ObjectMapper mapper;
    @GetMapping("/allActors")
    public List<Actor> getAllActors(){
        return repo.findAll();
    }
    @GetMapping("/actorLastNames")
    public List<String> getLastNames(){
        List<String> result = repo.findAll()
                .stream()
                .map(a -> a.getLastName())
                .toList();
        return result;
    }
    @GetMapping("/findActorByID")
    public ResponseEntity<String> getActorById(@RequestParam Integer id){
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/json");
        try {
            Optional<Actor> result = repo.findById(id);
            System.out.println(result.get());
            return new ResponseEntity<String>(
                    mapper.writeValueAsString(result.get()),
                    headers, HttpStatus.OK);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<String>(
                "{\"message\":\"Actor not found\"}",
                headers, HttpStatus.OK);
    }
    @GetMapping("/findByName")
    public List<Actor> findByLastName(@RequestParam String name){
        return repo.findByLastName(name);
    }
}
