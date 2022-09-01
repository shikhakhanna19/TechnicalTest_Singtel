package com.assignment_A2;

import com.assignment_A1.AnimalSound;

public class DuckSound implements AnimalSound{
	
	@Override
	public String sound(){
		System.out.println("Quack, quack");
		return "Quack, quack";
	}
	

}
