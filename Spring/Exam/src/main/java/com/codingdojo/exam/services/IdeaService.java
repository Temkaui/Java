package com.codingdojo.exam.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.exam.models.Idea;
import com.codingdojo.exam.repositories.IdeaRepository;


@Service
public class IdeaService {

	private IdeaRepository idearepo;
	
	public IdeaService(IdeaRepository idearepo) {
		this.idearepo = idearepo;
	}
	
	public Idea create(Idea idea) {
		return idearepo.save(idea);
	}
	
	public Idea update(Idea idea) {
		return idearepo.save(idea);
	}
	
	public ArrayList<Idea> findAll() {
		return (ArrayList<Idea>) idearepo.findAll();
	}
	
	public Idea findOne(Long id) {
		return idearepo.findOne(id);
	}
	
}
