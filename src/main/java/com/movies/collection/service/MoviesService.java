package com.movies.collection.service;

import com.movies.collection.dto.MoviesRequest;
import com.movies.collection.entity.Movies;
import com.movies.collection.repository.MoviesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MoviesService {
    @Autowired
    private MoviesRepository moviesRepository;
    public Movies insert (MoviesRequest moviesRequest){
        Movies movies = Movies.build(null, moviesRequest.getTitle(), moviesRequest.getDirector(),
                moviesRequest.getSummary(), moviesRequest.getGenres());
        return moviesRepository.save(movies);
    }
    public List<Movies> findAll(){
        return moviesRepository.findAllMovies();
    }
    public List<Movies> findByTitle(String title){
        return moviesRepository.findByTitle(title);
    }
    public Movies update (MoviesRequest moviesRequest){
        Movies movies = Movies.build(moviesRequest.getId(), moviesRequest.getTitle(), moviesRequest.getDirector(),
                moviesRequest.getSummary(), moviesRequest.getGenres());
        return moviesRepository.save(movies);
    }
    public boolean delete(Long id){
        moviesRepository.deleteById(id);
        return true;
    }

}
