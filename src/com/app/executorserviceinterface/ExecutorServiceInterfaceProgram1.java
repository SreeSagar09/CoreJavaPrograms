package com.app.executorserviceinterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceInterfaceProgram1 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
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
		
		executorService.shutdown();
	}
}
