package com.assignment_A3;

import com.assignment_A1.AnimalSound;

public class RoosterSound implements AnimalSound {
	
	@Override
	public String sound(){
		System.out.println("Cock-a-doodle-doo");
		return "Cock-a-doodle-doo";
	}
	

}
