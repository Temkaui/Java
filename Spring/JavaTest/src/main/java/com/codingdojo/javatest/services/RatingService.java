package com.codingdojo.javatest.services;

import org.springframework.stereotype.Service;

import com.codingdojo.javatest.models.Rating;
import com.codingdojo.javatest.repositories.RatingRepository;

@Service
public class RatingService {

	private RatingRepository ratingRepo;
	
	public RatingService(RatingRepository ratingRepo) {
		this.ratingRepo = ratingRepo;
	}
	
	public Rating create(Rating rating) {
		return ratingRepo.save(rating);
	}
	
}
