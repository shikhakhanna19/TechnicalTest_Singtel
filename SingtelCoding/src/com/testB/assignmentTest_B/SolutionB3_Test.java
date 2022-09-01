package com.testB.assignmentTest_B;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_B3.Dolphin;

public class SolutionB3_Test {
	
	
	@Test
	void test() {
		
		Dolphin dolphin = new Dolphin();
		Assert.assertEquals("Dolphins are good swimmers",dolphin.swim());
	}


}
