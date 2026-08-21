package com.app.completablefutureclass;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFutureClassProgram4 {
	public static void main(String[] args) throws Exception {
		Supplier<Integer> intSupplier = ()->{
			int sum = 0;
			
			for(int i=0; i<=5; i++) {
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
				
				sum += i;
			}
			
			return sum;
		};
		
		CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(intSupplier);
		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(intSupplier);
		
		Integer value = cf.get();
		Integer value2 = cf2.get(1, TimeUnit.MILLISECONDS);
		
		System.out.println("Value: "+value);
		System.out.println("Value: "+value2);
	}
}
