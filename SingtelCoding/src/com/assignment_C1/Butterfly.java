package com.assignment_C1;

import com.assignment_A1.Animal;
import com.assignment_A1.AnimalSound;
import com.assignment_A1.CanFly;

public class Butterfly extends Animal implements CanFly, AnimalSound{
	
	@Override
	public String fly(){
		System.out.println("Butterfly can fly");
		return "Butterfly can fly";
	}
	@Override
	public String sound(){
		System.out.println("A butterfly does not make a sound");
		return "A butterfly does not make a sound";
	}
	
	@Override
	public boolean can_swim() {
		return false;
	}

	@Override
	public boolean can_walk() {
		return false;
	}

	@Override
	public boolean can_fly() {
		return true;
	}

	@Override
	public boolean can_sing() {
		return false;
	}
	

}
