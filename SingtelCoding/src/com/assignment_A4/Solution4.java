package com.assignment_A4;

import com.assignment_A2.DuckSound;
import com.assignment_A3.RoosterSound;

public class Solution4 {

	public static void main(String[] args) {
		
		Parrot parrot = new Parrot();
		
		parrot.setCopyanimal(new DogSound());
		parrot.getCopyanimal();
		
		parrot.setCopyanimal(new CatSound());
		parrot.getCopyanimal();
		
		parrot.setCopyanimal(new RoosterSound());
		parrot.getCopyanimal();
		
		parrot.setCopyanimal(new PhoneSound());
		parrot.getCopyanimal();
		
		parrot.setCopyanimal(new DuckSound());
		parrot.getCopyanimal();
		

	}

}
