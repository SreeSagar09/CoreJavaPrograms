package com.app.executorsclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsClassProgram2 {
	public static void main(String[] args) throws Exception {
		/* It will create a thread pool with 10 number of worker threads */
		ExecutorService executorService = Executors.newWorkStealingPool(10);
		
		for(int i=0; i<=5; i++) {
			int index = i;
			executorService.execute(()->{
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+index);
			});
		}
		
		executorService.awaitTermination(5, TimeUnit.SECONDS);
	}
}
