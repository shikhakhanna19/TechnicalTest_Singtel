package com.assignment_A4;

import com.assignment_A1.AnimalSound;

public class DogSound implements AnimalSound{
	
	@Override
	public String sound(){
		System.out.println("Woof, woof");
		return "Woof, woof";
	}

}
