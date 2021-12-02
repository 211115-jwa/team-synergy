package com.revature.data;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.revature.beans.Pet;
import com.revature.data.collections.PetCollection;

public class PetDOATest {
	private PetDAO petDao = new PetCollection();

	@Test
	public void getByIdWhenIdExists() {
		
		// setup
		int idInput = 0;
		// call the method we're testing
		Pet personOutput = petDao.getById(idInput);
		// assert that it did what we expected
		assertEquals(0, personOutput.getId());
	}
	@Test
	public void getByIdButIdDoesNotExist() {
		int idInput = 1235;
		Pet personOutput = petDao.getById(idInput);
		assertNull(personOutput); // assertEquals(null, personOutput)
	}
}
