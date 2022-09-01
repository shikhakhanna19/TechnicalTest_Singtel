package com.assignment_A2;

import com.assignment_A1.CanSwim;

public class DuckSwim implements CanSwim{
	
	@Override
	public String swim(){
		System.out.println("Duck can swim");
		return "Duck can swim";
	}

}
