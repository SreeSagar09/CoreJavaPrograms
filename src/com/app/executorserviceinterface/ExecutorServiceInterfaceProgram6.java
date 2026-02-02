package com.app.executorserviceinterface;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceInterfaceProgram6 {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Callable<String> callable1 = ()->{
			Integer sum = 0;
			for(int i=0; i<=5; i++) {
				sum += i;
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Current Total: "+sum);
			}
			
			return new String("Task-1 result: "+sum);
		};
		
		Callable<String> callable2 = ()->{
			Integer sum = 0;
			for(int i=0; i<=10; i++) {
				sum += i;
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Current Total: "+sum);
			}
			
			return new String("Task-2 result: "+sum);
		};
		
		Callable<String> callable3 = ()->{
			Integer sum = 0;
			for(int i=0; i<=15; i++) {
				sum += i;
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Current Total: "+sum);
			}
			
			return new String("Task-3 result: "+sum);
		};
		
		Callable<String> callable4 = ()->{
			Integer sum = 0;
			for(int i=0; i<=20; i++) {
				sum += i;
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Current Total: "+sum);
			}
			
			return new String("Task-4 result: "+sum);
		};
		
		List<Callable<String>> taskList = List.of(callable1, callable2, callable3, callable4);
		
		List<Future<String>> futureList = executorService.invokeAll(taskList, 100, TimeUnit.MILLISECONDS);
		
		for(Future<String> future : futureList) {
			System.out.println(future.get()+", Future Status: "+future.isDone());
		}
		
		executorService.shutdown();
	}
}
