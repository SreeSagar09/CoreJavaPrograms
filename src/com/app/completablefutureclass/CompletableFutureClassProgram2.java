package com.app.completablefutureclass;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureClassProgram2 {
	public static void main(String[] args) throws Exception {
		Runnable runnable = ()->{
			for(int i=0; i<=5; i++) {
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
			}
		};
		
		CompletableFuture<Void> cf = CompletableFuture.runAsync(runnable);
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		CompletableFuture<Void> cf2 = CompletableFuture.runAsync(runnable, executorService);
		
		Void v = cf.get();
		Void v2 = cf2.get();
		
		System.out.println("Value: "+v);
		System.out.println("Value2: "+v2);
		
		executorService.shutdown();
	}
}
