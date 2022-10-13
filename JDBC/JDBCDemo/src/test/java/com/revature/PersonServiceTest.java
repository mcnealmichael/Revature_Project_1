package com.revature;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.repository.Person;
import com.revature.repository.PersonRepository;
import com.revature.service.PersonService;

/*
 * Mockito is a mocking framework for Java.  It is often used in conjunction with JUnit or other testing
 * frameworks in order to "mock" dependencies.  Mocking entailscrating a child class of a type
 * and overriding allof its methods, typically for the purpose of either stubbing (creating canned, 
 * "dummy" data) or completely stopping a method invocation.  
 * 
 * 
 */

public class PersonServiceTest {

	/*
	 * This annotation specifies that we wish to inject our most into our PersonService.
	 */
	@InjectMocks
	private PersonService personService;
	/*
	 * As the PersonService has at least one depency, I want to mock this depency using
	 * Mockito.  So let's provide a Mock!
	 */
	@Mock
	private PersonRepository personRepository;
	
	@BeforeAll
	public void setUp() {
		personService = new PersonService();
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testSortPersonsByName() {
		/*
		 * Mockito allows for easy stubbling.  That is to say, if I want a method that exists on
		 * my dependcy (PersonRepository class) NOT to be called, I need to specify what type of 
		 * data could be used in its place.  We can stub suing the following:
		 */
		List<Person> dummyPersons = Arrays.asList(
				new Person(1, "Christina", "Texas", "Purple", 29),
				new Person(2, "Zeke", "Georgia", "Black", 34),
				new Person(3, "Abe", "Texa", "Red", 65),
				new Person(4, "Betty", "Mississippi", "Pink", 50)
			);
		Mockito.when(this.personRepository.findAll().thenReturn(dummyPersons));
	}
	
}
