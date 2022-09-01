package com.testB.assignmentTest_B;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assignment_B1.Fish;
import com.assignment_B1.FishSing;
import com.assignment_B1.FishSwim;
import com.assignment_B1.FishWalk;

public class SolutionB1_Test {
	
	@Test
	void test() {
	
			
			Fish fish = new Fish();
			
			fish.setFishswim(new FishSwim());
			Assert.assertEquals("Fish can swim",fish.getFishswim());
			
			fish.setFishwalk(new FishWalk());
			Assert.assertEquals("Fish don't walk",fish.getFishwalk());
			
			fish.setFishsing(new FishSing());
			Assert.assertEquals("Fish don't sing",fish.getFishsing());	
			
			}

}
