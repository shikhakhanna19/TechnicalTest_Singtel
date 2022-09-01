package com.assignment_B1;

import com.assignment_A1.CanSing;

public class FishSing implements CanSing{
	
	@Override
	public String sing(){
		System.out.println("Fish don't sing");
		return "Fish don't sing";
	}


}
