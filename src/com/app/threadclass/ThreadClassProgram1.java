package com.app.threadclass;

public class ThreadClassProgram1 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
		}
	}
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadClassProgram1());
		Thread thread12 = new Thread(new ThreadClassProgram1());
		
		thread1.start();
		thread12.start();
	}
}
