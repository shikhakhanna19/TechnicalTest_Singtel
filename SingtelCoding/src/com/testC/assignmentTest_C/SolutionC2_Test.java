package com.testC.assignmentTest_C;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_C2.ButterflySound;
import com.assignment_C2.Butterfly_fly;
import com.assignment_C2.Caterpillar;

public class SolutionC2_Test {
	
	@Test
	void test() {
		

		Caterpillar caterpillar = new Caterpillar();
		
		Assert.assertEquals("A caterpillar cannot fly",caterpillar.fly());
		Assert.assertEquals("A caterpillar can walk (crawl)",caterpillar.walk());
		
		caterpillar.setButterfly_fly(new Butterfly_fly());
		Assert.assertEquals("Butterfly can fly",caterpillar.getButterfly_fly());
		
		caterpillar.setButterflysound(new ButterflySound());
		Assert.assertEquals("A butterfly does not make a sound",caterpillar.getButterflysound());
	}

}
