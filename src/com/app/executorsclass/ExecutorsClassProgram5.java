package com.app.executorsclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsClassProgram5 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		for(int i=0; i<=5; i++) {
			int index = i;
			executorService.execute(()->{
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+index);
			});
		}
		
		executorService.shutdown();
	}
}
