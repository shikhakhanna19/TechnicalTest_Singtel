package com.assignment_C2;

import com.assignment_A1.AnimalSound;

public class ButterflySound implements AnimalSound{
	
	@Override
	public String sound(){
		System.out.println("A butterfly does not make a sound");
		return "A butterfly does not make a sound";
	}

}
