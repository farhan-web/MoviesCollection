package com.movies.collection.controller;

import com.movies.collection.dto.MoviesRequest;
import com.movies.collection.entity.Movies;
import com.movies.collection.service.MoviesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {
    @Autowired
    private MoviesService moviesService;

    @PostMapping(
            path = "api/movies/insert",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Movies> insert(@RequestBody @Valid MoviesRequest moviesRequest){
        return new ResponseEntity<>(moviesService.insert(moviesRequest), HttpStatus.CREATED);
    }
    @GetMapping(
            path = "api/movies"
    )
    public List<Movies> findAll(){
        return moviesService.findAll();
    }
    @DeleteMapping(path = "api/movies/{id}")
    public boolean delete(@PathVariable Long id){
        return moviesService.delete(id);
    }

    @GetMapping(path = "api/movies/search/{title}")
    public List<Movies> search (@PathVariable String title){
        return moviesService.findByTitle(title);
    }

    @PostMapping(
            path = "api/movies/update",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Movies> Update (@RequestBody @Valid MoviesRequest moviesRequest){
        return new ResponseEntity<>(moviesService.update(moviesRequest), HttpStatus.CREATED);
    }





}
