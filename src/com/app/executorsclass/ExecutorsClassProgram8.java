package com.app.executorsclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExecutorsClassProgram8 {
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
		
		ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);
		
		for(int i=0; i<=10; i++) {
			int index = i;
			
			executorService.execute(()->{
				System.out.println("Thread Name: "+Thread.currentThread()+", Index: "+index);
			});
		}
		
		executorService.shutdown();
	}
}
