package com.codingdojo.javatest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.javatest.models.Show;

public interface ShowRepository extends CrudRepository<Show, Long> {
	@Query(value="SELECT * FROM shows ORDER BY avg_rating DESC;", nativeQuery=true)
	List<Show> findAll();
}
