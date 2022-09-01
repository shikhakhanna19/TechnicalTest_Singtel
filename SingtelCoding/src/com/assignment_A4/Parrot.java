package com.assignment_A4;

import com.assignment_A1.AnimalSound;
import com.assignment_A1.Bird;

public class Parrot extends Bird{
	
	private AnimalSound copyanimal;

	public String getCopyanimal() {
		return copyanimal.sound();
	}

	public void setCopyanimal(AnimalSound copyanimal) {
		this.copyanimal = copyanimal;
	}
	
	@Override
	public boolean can_swim() {
		return false;
	}

	@Override
	public boolean can_walk() {
		return true;
	}

	@Override
	public boolean can_fly() {
		return true;
	}

	@Override
	public boolean can_sing() {
		return true;
	}
	
	
	
	
}
