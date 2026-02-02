package com.app.executorserviceinterface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceInterfaceProgram4 {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Runnable runnable = ()->{
			for(int i=0; i<=5; i++) {
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
			}
		};
		
		Future<?> future1 = executorService.submit(runnable);
		Future<?> future2 = executorService.submit(runnable);
		
		System.out.println(future1.get());
		System.out.println(future2.get());
		
		executorService.shutdown();
	}
}
