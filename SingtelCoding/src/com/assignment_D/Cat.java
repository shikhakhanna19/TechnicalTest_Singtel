package com.assignment_D;

import com.assignment_A1.Animal;

public class Cat extends Animal{
	
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
		return false;
	}

	@Override
	public boolean can_sing() {
		return false;
	}

}
