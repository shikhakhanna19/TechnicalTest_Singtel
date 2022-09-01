package com.assignment_C2;

public class SolutionC2 {

	public static void main(String[] args) {
		
		Caterpillar caterpillar = new Caterpillar();
		
		caterpillar.fly();
		caterpillar.walk();
		
		caterpillar.setButterfly_fly(new Butterfly_fly());
		caterpillar.getButterfly_fly();
		
		caterpillar.setButterflysound(new ButterflySound());
		caterpillar.getButterflysound();
		

	}

}
