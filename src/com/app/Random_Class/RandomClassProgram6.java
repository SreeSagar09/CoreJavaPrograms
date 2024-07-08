package com.app.Random_Class;

import java.util.Random;

public class RandomClassProgram6 {
	public static void main(String[] args) {
		Random random = new Random();

		int randomInt = random.nextInt(899)+100;
		System.out.println("Random three digit number:");
		System.out.println(randomInt);
	}
}
