package com.sparta.sakilaweb.repositories;

import com.sparta.sakilaweb.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}