package com.movies.collection.repository;

import com.movies.collection.entity.Movies;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends CrudRepository<Movies, Long> {

    @Query("SELECT m FROM Movies m")
    public List<Movies> findAllMovies();

    @Query("SELECT m FROM Movies m WHERE m.title LIKE %:title%")
    public List<Movies> findByTitle(String title);

}
