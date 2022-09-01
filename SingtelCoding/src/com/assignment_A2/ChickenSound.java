package com.assignment_A2;

import com.assignment_A1.AnimalSound;

public class ChickenSound implements AnimalSound {
	
	@Override
	public String sound(){
		System.out.println("Cluck, cluck");
		return "Cluck, cluck";
	}
	
}


