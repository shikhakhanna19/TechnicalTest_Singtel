package com.assignment_A4;

import com.assignment_A1.AnimalSound;

public class PhoneSound implements AnimalSound {
	
	@Override
	public String sound(){
		System.out.println("Tring Tring");
		return "Tring Tring";
	}

}
