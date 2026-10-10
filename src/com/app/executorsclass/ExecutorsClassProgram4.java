package com.app.executorsclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExecutorsClassProgram4 {
	public static void main(String[] args) {
		ThreadFactory threadFactory = new ThreadFactory() {
			int count = 0;
			@Override
			public Thread newThread(Runnable r) {
				Thread thread = new Thread(r);
				thread.setName("Custom Thread Factory-"+(count++));
				
				return thread;
			}
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(5, threadFactory);
	
		for(int i=0; i<=5; i++) {
			int index = i;
			executorService.execute(()->{
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+index);
			});
		}
		
		executorService.shutdown();
	}
}
