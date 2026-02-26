package com.app.executorsclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsClassProgram2 {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newWorkStealingPool(10);
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<=5; i++) {
					System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
				}
			}
		};
		
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
		
		executorService.shutdown();
		executorService.awaitTermination(20, TimeUnit.SECONDS);
	}
}
