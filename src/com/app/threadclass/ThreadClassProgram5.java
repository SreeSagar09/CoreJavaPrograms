package com.app.threadclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadClassProgram5 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss SS");
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				try {
					for(int i=0; i<=5; i++) {
						Thread.sleep(1000);
						System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i+", Timestamp: "+simpleDateFormat.format(new Date()));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				try {
					for(int i=0; i<=5; i++) {
						Thread.sleep(1000);
						System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i+", Timestamp: "+simpleDateFormat.format(new Date()));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				try {
					for(int i=0; i<=5; i++) {
						Thread.sleep(1500);
						System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i+", Timestamp: "+simpleDateFormat.format(new Date()));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join(3000);
		thread3.start();
		thread3.join(0);
	}
}
