package com.assignment_A1;

public class Bird extends Animal implements CanSing,CanFly{
	
	public String fly() {
		
		System.out.println("Bird can fly");
		return("Bird can fly");
		
	}
	
    public String sing() {
		
		System.out.println("Bird can Sing");
		return("Bird can Sing");
	}
    
    @Override
    public String walk(){
		
		System.out.println("Bird Can walk");
		return("Bird can walk");
	}
    
    @Override
	public boolean can_swim() {
		return true;
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
