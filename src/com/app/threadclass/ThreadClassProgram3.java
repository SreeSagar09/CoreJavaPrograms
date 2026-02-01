package com.app.threadclass;

public class ThreadClassProgram3 {
	public static void main(String[] args) {
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<=5; i++) {
					System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
				}
			}
		};
		
		Runnable runnable2 = ()->{
			for(int i=0; i<=5; i++) {
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
			}
		};
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		Thread thread3 = new Thread(()->{
			for(int i=0; i<=5; i++) {
				System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
			}
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
