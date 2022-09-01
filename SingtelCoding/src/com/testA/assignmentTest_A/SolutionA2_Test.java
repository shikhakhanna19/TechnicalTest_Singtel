package com.testA.assignmentTest_A;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_A2.Chicken;
import com.assignment_A2.ChickenFly;
import com.assignment_A2.ChickenSound;
import com.assignment_A2.Duck;
import com.assignment_A2.DuckFly;
import com.assignment_A2.DuckSound;
import com.assignment_A2.DuckSwim;

public class SolutionA2_Test {
	
	@Test
	void test() {
		Duck duck = new Duck();
		Chicken chicken = new Chicken();
		
		
	
		duck.setDuckfly(new DuckFly());
		Assert.assertEquals("Duck can fly",duck.getDuckfly());

		duck.setDucksound(new DuckSound());
		Assert.assertEquals("Quack, quack",duck.getDucksound());

		duck.setDuckswim(new DuckSwim());
		Assert.assertEquals("Duck can swim",duck.getDuckswim());


		
		chicken.setChickfly(new ChickenFly());
		Assert.assertEquals("Chicken cannot fly",chicken.getChickfly());


		chicken.setChicksound(new ChickenSound());
		Assert.assertEquals("Cluck, cluck",chicken.getChicksound());
	}

}
