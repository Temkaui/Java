package com.codingdojo.movies.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.movies.models.Movie;
import com.codingdojo.movies.repositories.MovieRepository;

@Service
public class MovieService {
	
	private MovieRepository movieRepository;
	
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	public Movie create(Movie movie) {
		return movieRepository.save(movie);
	}

	public ArrayList<Movie> all(){
		return (ArrayList<Movie>) movieRepository.findAll();
	}
}
