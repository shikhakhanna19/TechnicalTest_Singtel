package com.assignment_A2;

import com.assignment_A1.CanFly;

public class ChickenFly implements CanFly{
	
	@Override
	public String fly(){
		System.out.println("Chicken cannot fly");
		return "Chicken cannot fly";
		
	}

}
