package com.assignment_B2;

import com.assignment_A1.Animal;
import com.assignment_B1.FishFeatures;

public class Clownfish extends Animal implements FishFeatures{
	
	@Override
	public String looks() {
		
		System.out.println("Clownfish are small and colourful (orange)");
		return("Clownfish are small and colourful (orange)");
	}
	
	
	@Override
	public String likes() {
		
		System.out.println("Clownfish make jokes");
		return("Clownfish make jokes");
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
