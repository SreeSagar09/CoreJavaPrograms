package com.app.completablefutureclass;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CompletableFutureClassProgram1 {
	public static void main(String[] args) throws Exception {
		Supplier<Integer> integerSupplier = ()->{
			int sum = 0;
			
			for(int i=0; i<=5; i++) {
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
				
				sum += i;
			}
			
			return sum;
		};
		
		CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(integerSupplier);
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(integerSupplier, executorService);
		
		
		Integer sum = completableFuture.get();
		Integer sum2 = completableFuture2.get();
		
		System.out.println("Sum: "+sum);
		System.out.println("Sum2: "+sum2);
		
		executorService.shutdown();
	}
}
