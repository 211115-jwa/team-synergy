package com.revature.data.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.revature.beans.Person;
import com.revature.beans.Pet;
import com.revature.data.PersonDAO;

public class PersonCollection implements PersonDAO {
	private Set<Person> allPeople;
	private int lastIndex;

	public PersonCollection() {
		allPeople = new HashSet<>();
		Person person1 = new Person();
		List<Pet> pet = new ArrayList<Pet>();
		person1.setFullName("James Doe");
		person1.setId(1234);
		person1.setUsername("DJames1985");
		person1.setPassword("MyNameIsJeff@");
		person1.setRole("Software Developer");
		person1.setPets(pet);
		allPeople.add(person1);
		lastIndex = 0;
	}
	
	@Override
	public int create(Person dataToAdd) {
		lastIndex++;
		dataToAdd.setId(lastIndex);
		allPeople.add(dataToAdd);
		return dataToAdd.getId();
	}

	@Override
	public Person getById(int id) {
		for (Person person : allPeople) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}

	@Override
	public Set<Person> getAll() {
		return allPeople;
	}

	@Override
	public void update(Person dataToUpdate) {
		Person previousData = getById(dataToUpdate.getId());
		if (previousData != null) {
			allPeople.remove(previousData);
			allPeople.add(dataToUpdate);
		}
	}

	@Override
	public void delete(Person dataToDelete) {
		Person previousData = getById(dataToDelete.getId());
		if (previousData != null) {
			allPeople.remove(previousData);
		}
	}

	@Override
	public Person getByUsername(String username) {
		for (Person person : allPeople) {
			if (person.getUsername().equals(username)) {
				return person;
			}
		}
		return null;
	}

	@Override
	public Person getByFullName(String fullname) {
		for (Person person : allPeople) {
			if (person.getFullName().equals(fullname)) {
				return person;
			}
		}
		return null;
	}

	@Override
	public Person setById( int idInput) {
		for (Person person : allPeople) {
			if (person.getId() == (idInput)) {
				return person;
			}
		}
		return null;
	}

}
