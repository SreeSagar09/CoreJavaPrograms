package com.app.completablefutureclass;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureClassProgram3 {
	public static void main(String[] args) throws Exception {
		CompletableFuture<String> cf = CompletableFuture.completedFuture("Hello");
		
		String value = cf.get();
		
		System.out.println("Value: "+value);
	}
}
