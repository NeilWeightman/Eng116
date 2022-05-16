package com.sparta.sakilaweb.controller;

import com.sparta.sakilaweb.entities.Film;
import com.sparta.sakilaweb.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SakilaController {
    @Autowired
    private FilmRepository filmRepo;

    @GetMapping("/welcome")
    public String sayHello(){
        return "welcome";
    }

    @GetMapping("/film/{id}")
    public String getFilmById(@PathVariable int id, Model model){
        Film filmObj = filmRepo.getById(id);
        System.out.println(filmObj);
        model.addAttribute("filmAttr", filmObj); // store the film in the model
        return "filmView";
    }
}
