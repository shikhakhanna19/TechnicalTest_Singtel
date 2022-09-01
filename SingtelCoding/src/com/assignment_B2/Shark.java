package com.assignment_B2;

import com.assignment_A1.Animal;
import com.assignment_B1.FishFeatures;

public class Shark extends Animal implements FishFeatures{
	
	@Override
	public String looks() {
		
		System.out.println("Sharks are large and grey");
		return("Sharks are large and grey");
	}
	
	
	@Override
	public String likes() {
		
		System.out.println("Sharks eat other fish");
		return("Sharks eat other fish");
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
