package com.sparta.sakilaweb.controller;

import com.sparta.sakilaweb.entities.Film;
import com.sparta.sakilaweb.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("film")
    public String getAllFilms(Model model){
        List<Film> result = filmRepo.findAll();
        model.addAttribute("allFilmsList", result);
        return "allFilms";
    }
    @GetMapping("/delete/{id}")
    public String deleteFilm(@PathVariable int id, Model model){
        filmRepo.deleteById(id);
        model.addAttribute("id_deleted", id);
        return "filmDeleted";
    }
    @GetMapping("/edit/{id}")
    public String editFilm(@PathVariable int id, Model model){
        Film thisFilm = filmRepo.getById(id);
        model.addAttribute("filmToEdit", thisFilm);
        return "editFilmForm";
    }
    @PostMapping("/updateFilm")
    public String updateFilm(@ModelAttribute("filmToEdit") Film theFilm){
        Film oldState = filmRepo.getById(theFilm.getId());
        // replace the values in the old object with the new values from theFilm
        // oldState.setTitle(theFilm.getTitle()); etc...
        filmRepo.save(oldState);
        return "editSuccess";
    }
}
