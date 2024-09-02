package com.app.randomclass;

import java.util.Random;

public class RandomClassProgram7 {
	public static void main(String[] args) {
		Random random = new Random();
		
		Integer otp = random.nextInt(899999)+100000;
		System.out.println("Six digit Random OTP:");
		System.out.println(otp);
	}
}
