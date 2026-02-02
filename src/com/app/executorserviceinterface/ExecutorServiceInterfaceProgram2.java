package com.app.executorserviceinterface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceInterfaceProgram2 {
	 public static void main(String[] args) throws Exception {
		 ExecutorService executorService = Executors.newFixedThreadPool(10);
		 
		 Callable<Integer> callable1 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Integer sum = 0;
				for(int i=0; i<=10; i++) {
					sum += i;
					System.out.println("Thread Name: "+Thread.currentThread().getName()+", Current Total: "+sum);
				}
				return sum;
			}
		};
		
		Callable<Long> callable2 = ()->{
			Long sum = 0l;
			for(int i=0; i<=15; i++) {
				sum += i;
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Current Total: "+sum);
			}
			return sum;
		};
		
		Future<Integer> future1 = executorService.submit(callable1);
		Future<Long> future2 = executorService.submit(callable2);
		
		System.out.println("Total Value: "+future1.get());
		System.out.println("Total Value: "+future2.get());
		
		executorService.shutdown();
	}
}
