package com.assignment_C2;

import com.assignment_A1.CanFly;
import com.assignment_B1.CanWalk;

public class Caterpillar implements CanFly, CanWalk{
	
	
	private Butterfly_fly butterfly_fly;
	
	private ButterflySound butterflysound;
	
	
	@Override
	public String fly(){
		System.out.println("A caterpillar cannot fly");
		return "A caterpillar cannot fly";
	}
	@Override
	public String walk(){
		System.out.println("A caterpillar can walk (crawl)");
		return "A caterpillar can walk (crawl)";
	}
	
	public String getButterfly_fly() {
		return butterfly_fly.fly();
	}
	public void setButterfly_fly(Butterfly_fly butterfly_fly) {
		this.butterfly_fly = butterfly_fly;
	}
	public String getButterflysound() {
		return butterflysound.sound();
	}
	public void setButterflysound(ButterflySound butterflysound) {
		this.butterflysound = butterflysound;
	}
	
	
	

}
