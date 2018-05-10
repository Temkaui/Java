package com.codingdojo.movies.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.movies.models.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {

}
