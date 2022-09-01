package com.assignment_A3;

import com.assignment_A1.Bird;

public class Rooster extends Bird {
	
	private RoosterSound roostersound;
	

	public String getRoostersound() {
		return roostersound.sound();
	}

	public void setRoostersound(RoosterSound roostersound) {
		this.roostersound = roostersound;
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
		return false;
	}
	
	

}
