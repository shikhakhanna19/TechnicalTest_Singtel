package com.testC.assignmentTest_C;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_C1.Butterfly;

public class SolutionC1_Test {
	
	@Test
	void test() {
		
		Butterfly butterfly = new Butterfly();
		
		Assert.assertEquals("Butterfly can fly",butterfly.fly());
		Assert.assertEquals("A butterfly does not make a sound",butterfly.sound());
	}


}
