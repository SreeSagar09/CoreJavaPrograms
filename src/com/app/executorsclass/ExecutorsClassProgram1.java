package com.app.executorsclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsClassProgram1 {
	public static void main(String[] args) {
		/* It will create a thread pool with 10 number of threads */
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i=0; i<=5; i++) {
			int index = i;
			executorService.execute(()->{
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+index);
			});
		}
		
		executorService.shutdown();
	}
}
