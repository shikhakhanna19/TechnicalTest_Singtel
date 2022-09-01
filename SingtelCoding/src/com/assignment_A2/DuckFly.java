package com.assignment_A2;

import com.assignment_A1.CanFly;

public class DuckFly implements CanFly{
	
	@Override
	public String fly(){
		System.out.println("Duck can fly");
		return "Duck can fly";
	}

}
