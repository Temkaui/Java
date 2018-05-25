package com.codingdojo.javatest.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.javatest.models.Show;
import com.codingdojo.javatest.repositories.ShowRepository;

@Service
public class ShowService {

	private ShowRepository showrepo;
	
	public ShowService(ShowRepository showrepo) {
		this.showrepo = showrepo;
	}
	
	public Show create(Show show) {
		return showrepo.save(show);
	}
	
	public Show update(Show show) {
		return showrepo.save(show);
	}
	
	public ArrayList<Show> findAll() {
		return (ArrayList<Show>) showrepo.findAll();
	}
	
	public Show findOne(Long id) {
		return showrepo.findOne(id);
	}
	
}
