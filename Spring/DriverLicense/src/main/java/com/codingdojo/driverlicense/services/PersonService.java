package com.codingdojo.driverlicense.services;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codingdojo.driverlicense.models.Person;
import com.codingdojo.driverlicense.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personrepo;
	
	public PersonService(PersonRepository personrepo) {
		this.personrepo = personrepo;
	}
	
	public Person create(Map<String, String> body) {
		return personrepo.save(new Person(
				body.get("firstName"),
				body.get("lastName")
		));
	}
}
