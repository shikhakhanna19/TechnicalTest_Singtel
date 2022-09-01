package com.assignment_D;

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

public class SolutionD {

	public static void main(String[] args) {
		
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
		System.out.println("No of animals can fly" + fly_count);
		System.out.println("No of animals can swim" + swim_count);
		System.out.println("No of animals can walk" + walk_count);
		System.out.println("No of animals can sing" + sing_count);
		

	}

}
