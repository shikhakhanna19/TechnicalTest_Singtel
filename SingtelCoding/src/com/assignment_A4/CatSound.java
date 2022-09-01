package com.assignment_A4;

import com.assignment_A1.AnimalSound;

public class CatSound implements AnimalSound{
	
	@Override
	public String sound(){
		System.out.println("Me ow, Me ow");
		return "Me ow, Me ow";
	}

}
