package com.app.Random_Class;

import java.util.Random;

public class RandomClassProgram1 {
	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("Random Boolean: "+random.nextBoolean());
		System.out.println("Random Int: "+random.nextInt());
		System.out.println("Random Long: "+random.nextLong());
		System.out.println("Random Float: "+random.nextFloat());
		System.out.println("Random Double: "+random.nextDouble());
		System.out.println("Random Gaussian: "+random.nextGaussian());
	}
}
