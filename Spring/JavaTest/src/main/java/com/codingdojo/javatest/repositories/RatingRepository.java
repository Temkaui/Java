package com.codingdojo.javatest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.javatest.models.Rating;

public interface RatingRepository extends CrudRepository<Rating, Long> {

}
