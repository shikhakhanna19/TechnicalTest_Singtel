package com.testD.assignmentTest_D;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_A1.Animal;
import com.assignment_A1.Bird;
import com.assignment_A2.Chicken;
import com.assignment_A2.Duck;
import com.assignment_A3.Rooster;
import com.assignment_A4.Parrot;
import com.assignment_B1.Fish;
import com.assignment_B2.Clownfish;
import com.assignment_B2.Shark;
import com.assignment_B3.Dolphin;
import com.assignment_C1.Butterfly;
import com.assignment_D.Cat;
import com.assignment_D.Dog;
import com.assignment_D.Frog;

public class SolutionD_Test {
	
	@Test
	void test() {
		

		int fly_count = 0;
		int walk_count = 0;
		int sing_count = 0;
		int swim_count = 0;
		
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin (),
				new Frog (),
				new Dog(),
				new Butterfly (),
				new Cat()
				};
		
		
				
		for(int i=0;i<animals.length;i++) {
			
			
			
			if (animals[i].can_fly()) {
				
				fly_count++;
			}
			if (animals[i].can_walk()) {
				
				walk_count++;
			}
			if (animals[i].can_sing()) {
				
				sing_count++;
			}
			if (animals[i].can_swim()) {
				
				swim_count++;
			}
			
			
		}
	
		
		Assert.assertEquals(5, fly_count);
		Assert.assertEquals(7, swim_count);
		Assert.assertEquals(8, walk_count);
		Assert.assertEquals(2, sing_count);
		
		

	}

}
