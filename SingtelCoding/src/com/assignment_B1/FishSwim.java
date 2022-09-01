package com.assignment_B1;

import com.assignment_A1.CanSwim;

public class FishSwim implements CanSwim {
	
	@Override
	public String swim(){
		System.out.println("Fish can swim");
		return "Fish can swim";
	}


}
