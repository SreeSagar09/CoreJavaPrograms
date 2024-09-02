package com.app.randomclass;

import java.util.Random;

public class RandomClassProgram5 {
	public static void main(String[] args) {
		String[] alphabets = {"A","B","C","D","E","F","G","H",
				"I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

		Random random = new Random();
		int i = random.nextInt(alphabets.length);
		System.out.println("Random Value from Array:");
		System.out.println(alphabets[i]);
	}
}
