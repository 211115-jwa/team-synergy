package com.revature.data.collections;

import java.util.HashSet;
import java.util.Set;

import com.revature.beans.Pet;
import com.revature.data.PetDAO;

public class PetCollection implements PetDAO{
	private Set<Pet> allPets;
	private int lastIndex;
	
	public PetCollection() {
		allPets = new HashSet<>();
		Pet pet1 = new Pet();
		pet1.setId(0);
		allPets.add(pet1);
		lastIndex = 0;
	}

	@Override
	public int create(Pet dataToAdd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pet getById(int id) {
		for (Pet pet : allPets) {
			if (pet.getId() == id) {
				return pet;
			}
		}
		return null;
	}

	@Override
	public Set<Pet> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Pet dataToUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pet dataToDelete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Pet> getByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
