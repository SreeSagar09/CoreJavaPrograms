package com.app.Random_Class;

import java.util.Random;

public class RandomClassProgram4 {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Two Digit Random Number:");
		System.out.println(random.nextInt(89)+10);
	}
}
