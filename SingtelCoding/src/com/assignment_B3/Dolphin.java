package com.assignment_B3;

import com.assignment_A1.Animal;
import com.assignment_A1.CanSwim;

public class Dolphin extends Animal implements CanSwim {
	
	@Override
	public String swim() {
		
		System.out.println("Dolphins are good swimmers");
		return("Dolphins are good swimmers");
	}
	
	@Override
	public boolean can_swim() {
		return true;
	}

	@Override
	public boolean can_walk() {
		return false;
	}

	@Override
	public boolean can_fly() {
		return false;
	}

	@Override
	public boolean can_sing() {
		return false;
	}

}
