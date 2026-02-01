package com.app.threadclass;

public class ThreadClassProgram2 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i);
		}
	}

	public static void main(String[] args) {
		ThreadClassProgram2 tcp21 = new ThreadClassProgram2();
		ThreadClassProgram2 tcp22 = new ThreadClassProgram2();
		
		tcp21.start();
		tcp22.start();
	}
}
