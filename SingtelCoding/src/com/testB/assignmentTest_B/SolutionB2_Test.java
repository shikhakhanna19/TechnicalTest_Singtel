package com.testB.assignmentTest_B;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_B2.Clownfish;
import com.assignment_B2.Shark;

public class SolutionB2_Test {
	
	@Test
	void test() {
		
		Shark shark = new Shark();
		
		Assert.assertEquals("Sharks eat other fish",shark.likes());
		Assert.assertEquals("Sharks are large and grey",shark.looks());
		
		Clownfish clownfish = new Clownfish();
		
		Assert.assertEquals("Clownfish make jokes",clownfish.likes());
		Assert.assertEquals("Clownfish are small and colourful (orange)",clownfish.looks());
		
	}

}
