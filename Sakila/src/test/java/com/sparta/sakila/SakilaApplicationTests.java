package com.sparta.sakila;

import com.sparta.sakila.entities.Actor;
import com.sparta.sakila.repositories.ActorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional // enables a database transaction session
class SakilaApplicationTests {
    @Autowired
    private ActorRepository repo;

//    @Test
//    public void checkRepoLoaded(){
//        assertNotNull(repo);
//    }

    @Test
    public void checkActorIsFound(){
        Actor actor = repo.findByLastName("BERRY").get(0);
//        assertEquals("KARL", actor.getFirstName()); // traditional style of JUnit
        assertThat(actor.getFirstName())
                .isEqualTo("KARL");
    }
    @Test
    public void checkNumResults(){
        List<Actor> result = repo.findAll();
        assertThat(result.size()).isEqualTo(200);
    }
}
