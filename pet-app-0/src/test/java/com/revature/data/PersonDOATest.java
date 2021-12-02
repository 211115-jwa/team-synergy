package com.revature.data;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.revature.beans.Person;
import com.revature.beans.Pet;
import com.revature.data.PersonDAO;
import com.revature.data.collections.PersonCollection;
public class PersonDOATest {
	//JUnit tests will be annotated with @Test
	//they are public, void and have no parameters
	private PersonDAO personDao = new PersonCollection();
	
	/*@BeforeAll //this method will run ONCE before any of our tests run
	public static void personSetup() {
		System.out.println("This happens before any test have been completed");
		Person person = new Person();
		List<Pet> pet = new ArrayList<Pet>();
		person.setFullName("James Doe");
		person.setId(1234);
		person.setUsername("DJames1985");
		person.setPassword("MyNameIsJeff@");
		person.setRole("Software Developer");
		person.setPets(pet);
	}
*/	
	
	// @Order(1)
		@Test
		public void getByUsernameWhenUsernameExists() {
			// setup
			String usernameInput = "DJames1985";
			// call the method we're testing
			Person personOutput = personDao.getByUsername(usernameInput);
			// assert that it did what we expected
			assertEquals("DJames1985", personOutput.getUsername());
		}

		// @Order(2)
		@Test
		public void getByUsernameButUsernameDoesNotExist() {
			String usernameInput = "qwertyuiop";
			Person personOutput = personDao.getByUsername(usernameInput);
			assertNull(personOutput); // assertEquals(null, personOutput)
		}
		
		@Test
		public void getByFullNameWhenFullNameExists() {
			// setup
			String fullNameInput = "James Doe";
			// call the method we're testing
			Person personOutput = personDao.getByFullName(fullNameInput);
			// assert that it did what we expected
			assertEquals("James Doe", personOutput.getFullName());
		}

		// @Order(2)
		@Test
		public void getByFullNameButFullNameDoesNotExist() {
			String fullNameInput = "Sierra";
			Person personOutput = personDao.getByFullName(fullNameInput);
			assertNull(personOutput); // assertEquals(null, personOutput)
		}
		@Test
		public void getByIdWhenIdExists() {
			// setup
			int idInput = 1234;
			// call the method we're testing
			Person personOutput = personDao.getById(idInput);
			// assert that it did what we expected
			assertEquals(1234, personOutput.getId());
		}

		// @Order(2)
		@Test
		public void getByIdButIdDoesNotExist() {
			int idInput = 1235;
			Person personOutput = personDao.getById(idInput);
			assertNull(personOutput); // assertEquals(null, personOutput)
		}
		@Test
		public void setByIdWhenIdExists() {
			// setup
			int idInput = 1234;
			// call the method we're testing
			Person personOutput = personDao.setById(idInput);
			// assert that it did what we expected
			assertEquals(1234, personOutput.getId());
		}

		// @Order(2)
		@Test
		public void setByIdButIdDoesNotExist() {
			int idInput = 1235;
			Person personOutput = personDao.setById(idInput);
			assertNull(personOutput); // assertEquals(null, personOutput)
		}
		@Order(6)
		@Test
		public void getallTest() {
			assertNotNull(personDao.getAll());	// use person dao to test that the get all method is not null
		}
		
		@Order(7)
		@Test
		public void createTest() {
			Person create = new Person();
			assertNotEquals(0, personDao.create(create));
			// use person dao to test that create method is not null
		}
		
	@Test
	public void basicTest() {
		//setup
		StringBuilder input = new StringBuilder("hello");
		//call method were testing
		input.reverse();
		//check for the expected behavior
		//Assertions.assertEquals("olleh", input); //failed
		Assertions.assertEquals("olleh", input.toString()); //passed
	}


	//@Order(1)
	@Test
	public void basicTest2() {}
	@BeforeAll //this method will run ONCE before any of our tests run
	public static void beforeSetup() {
		System.out.println("This happens before any test have been completed");
		
	}

	@BeforeEach //this method runs before each test
	public void beforeEachTest() {
		System.out.println("This happens before each test");
	}
	
	@AfterEach //this method will run after each test
	public void afterEachTest() {
		System.out.println("This happens after each test");
	}
	
	@AfterAll //this method will run ONCE before any of our tests run
	public static void afterSetup() {
		System.out.println("This happens after all test have been completed");
	}
	
}
