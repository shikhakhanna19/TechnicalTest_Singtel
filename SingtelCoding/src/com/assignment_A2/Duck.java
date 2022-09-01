package com.assignment_A2;

import com.assignment_A1.Bird;

public class Duck extends Bird {
	
	//composition has-a relationship
    private DuckFly duckfly;
    private DuckSwim duckswim;
    private DuckSound ducksound;
   


	public String getDuckfly() {
		
		return duckfly.fly();
	}



	public void setDuckfly(DuckFly duckfly) {
		this.duckfly = duckfly;
	}



	public String getDuckswim() {
		return duckswim.swim();
	}



	public void setDuckswim(DuckSwim duckswim) {
		this.duckswim = duckswim;
	}



	public String getDucksound() {
		return ducksound.sound();
	}



	public void setDucksound(DuckSound ducksound) {
		this.ducksound = ducksound;
	}
	

	//common behavior for all animals 
	public String walk(){
			System.out.println("I am walking");
			return "I am walking";
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
		return false;
	}

	
	

}
