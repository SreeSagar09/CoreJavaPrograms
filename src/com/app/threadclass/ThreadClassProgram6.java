package com.app.threadclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadClassProgram6 {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss SS");
		
		Thread thread1 = new Thread(){
			@Override
			public void run() {
				try {
					for(int i=0; i<=5; i++) {
						Thread.yield();
						System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i+", Timestamp: "+simpleDateFormat.format(new Date()));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		
		Thread thread2 = new Thread(){
			@Override
			public void run() {
				try {
					for(int i=0; i<=5; i++) {
						System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i+", Timestamp: "+simpleDateFormat.format(new Date()));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};	
		
		Thread thread3 = new Thread(){
			@Override
			public void run() {
				try {
					for(int i=0; i<=5; i++) {
						System.out.println("Thread Name: "+Thread.currentThread().getName()+", Index: "+i+", Timestamp: "+simpleDateFormat.format(new Date()));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
