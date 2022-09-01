package com.testA.assignmentTest_A;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_A3.Rooster;
import com.assignment_A3.RoosterSound;

public class SolutionA3_Test {
	
	@Test
	void test() {

		
		Rooster rooster = new Rooster();
		
		rooster.setRoostersound(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo",rooster.getRoostersound());
	
		
		
	}

}
