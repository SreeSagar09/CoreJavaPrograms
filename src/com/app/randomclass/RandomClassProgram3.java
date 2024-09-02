package com.app.randomclass;

import java.util.Random;

public class RandomClassProgram3 {
	public static void main(String[] args) {
		Random random = new Random();
		
		for(int i=1; i<=10; i++) {
			System.out.println(Math.abs(random.nextInt()));
		}
	}
}
