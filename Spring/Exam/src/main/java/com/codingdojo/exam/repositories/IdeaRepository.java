package com.codingdojo.exam.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.exam.models.Idea;

public interface IdeaRepository extends CrudRepository<Idea, Long> {
//	@Query(value="SELECT * FROM ideas ORDER BY likes DESC;", nativeQuery=true)
	List<Idea> findAll();
}
