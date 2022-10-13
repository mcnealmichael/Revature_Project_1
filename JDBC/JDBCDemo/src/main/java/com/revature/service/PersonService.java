package com.revature.service;

import java.util.Collections;
import java.util.List;

import com.revature.repository.Person;
import com.revature.repository.PersonRepository;

public class PersonService {
		
		/*
		 * This is a depencdency of the PersonService class.  The PersonService depends on the 
		 * PersonRepository object to perform its job properly.
		 */
	
		private PersonRepository personRepository;
		
		public PersonService() {
			this.personRepository = new PersonRepository();
		}
		
		public List<Person> sortPeopleByName(){
			
			ListPerson> retrievedPeople = this.personRepository.findAll();
			Collections.sort(retriedPeople, (p1, p2) -> p1);
			
		}
		
	}
	
}
