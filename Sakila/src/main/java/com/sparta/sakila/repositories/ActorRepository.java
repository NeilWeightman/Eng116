package com.sparta.sakila.repositories;

import com.sparta.sakila.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    List<Actor> findByLastName(String lastName);
}