package com.testA.assignmentTest_A;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_A1.Bird;

public class SolutionA1_Test {
	
	@Test
	void test() {
	
			Bird bird = new Bird();
			Assert.assertEquals("Bird can walk",bird.walk());
			Assert.assertEquals("Bird can fly",bird.fly());
			Assert.assertEquals("Bird can Sing",bird.sing());
			
			}

}
