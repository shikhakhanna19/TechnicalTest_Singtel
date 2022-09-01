package com.assignment_B1;

import com.assignment_A1.Animal;

public class Fish extends Animal{
	
	private FishSwim fishswim;
	private FishWalk fishwalk;
	private FishSing fishsing;
	

	public String getFishswim() {
		return fishswim.swim();
	}

	public void setFishswim(FishSwim fishswim) {
		this.fishswim = fishswim;
	}

	public String getFishwalk() {
		return fishwalk.walk();
	}

	public void setFishwalk(FishWalk fishwalk) {
		this.fishwalk = fishwalk;
	}

	public String getFishsing() {
		return fishsing.sing();
	}

	public void setFishsing(FishSing fishsing) {
		this.fishsing = fishsing;
	}
	
	@Override
	public boolean can_swim() {
		return true;
	}

	@Override
	public boolean can_walk() {
		return false;
	}

	@Override
	public boolean can_fly() {
		return false;
	}

	@Override
	public boolean can_sing() {
		return false;
	}
	

}
