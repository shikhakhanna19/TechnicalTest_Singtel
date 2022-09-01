package com.assignment_A2;

import com.assignment_A1.Bird;

public class Chicken extends Bird{
	
	private ChickenSound chicksound;
	private ChickenFly chickfly;
	
	
	
	public String getChicksound() {
		return chicksound.sound();
	}
	
	public void setChicksound(ChickenSound chicksound) {
		this.chicksound = chicksound;
	}
	
	public String getChickfly() {
		return chickfly.fly();
	}
	
	public void setChickfly(ChickenFly chickfly) {
		this.chickfly = chickfly;
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
		return false;
	}

	@Override
	public boolean can_sing() {
		return false;
	}
	
	

}
