package com.assignment_A2;


public class SolutionA2 {

	public static void main(String[] args) {
		
		Duck duck = new Duck();
		Chicken Chicken = new Chicken();
		
		duck.setDuckfly(new DuckFly());
		duck.setDucksound(new DuckSound());
		duck.setDuckswim(new DuckSwim());
		Chicken.setChickfly(new ChickenFly());
		Chicken.setChicksound(new ChickenSound());
		
		Chicken.getChickfly();
		Chicken.getChicksound();
		duck.getDuckfly();
		duck.getDucksound();
		duck.getDuckswim();
		
		
		
		
		}

}
