package com.testA.assignmentTest_A;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_A2.DuckSound;
import com.assignment_A3.RoosterSound;
import com.assignment_A4.CatSound;
import com.assignment_A4.DogSound;
import com.assignment_A4.Parrot;
import com.assignment_A4.PhoneSound;

public class SolutionA4_Test {
	
	@Test
	void test() {
		
		Parrot parrot = new Parrot();
		
		parrot.setCopyanimal(new DogSound());
		Assert.assertEquals("Woof, woof",parrot.getCopyanimal());
	
		parrot.setCopyanimal(new CatSound());
		Assert.assertEquals("Me ow, Me ow",parrot.getCopyanimal());
	
		parrot.setCopyanimal(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo",parrot.getCopyanimal());
	
		parrot.setCopyanimal(new PhoneSound());
		Assert.assertEquals("Tring Tring",parrot.getCopyanimal());

		parrot.setCopyanimal(new DuckSound());
		Assert.assertEquals("Quack, quack",parrot.getCopyanimal());
	
		
	}

}
