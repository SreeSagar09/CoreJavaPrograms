package com.app.calendarclass;

import java.util.Calendar;

public class CalendarClassProgram5 {
	public static void main(String[] args) {
		Calendar calendar1 = Calendar.getInstance();
		System.out.println("Date: "+calendar1.getTime());
		
		calendar1.set(Calendar.DATE, 2);
		System.out.println("Setting date to 2, then date is: "+calendar1.getTime());
		
		
		Calendar calendar2 = Calendar.getInstance();
		System.out.println("Date: "+calendar2.getTime());
		
		calendar2.set(Calendar.DAY_OF_MONTH, 2);
		System.out.println("Setting day of month to 2, then date is: "+calendar2.getTime());
	
		
		Calendar calendar3 = Calendar.getInstance();
		System.out.println("Date: "+calendar3.getTime());
		
		calendar3.set(Calendar.DAY_OF_WEEK, 2);
		System.out.println("Setting day of week to 2, then date is: "+calendar3.getTime());
	
		
		Calendar calendar4 = Calendar.getInstance();
		System.out.println("Date: "+calendar4.getTime());
		
		calendar4.set(Calendar.DAY_OF_YEAR, 2);
		System.out.println("Setting day of year to 2, then date is: "+calendar4.getTime());
	
		
		Calendar calendar5 = Calendar.getInstance();
		System.out.println("Date: "+calendar5.getTime());
		
		calendar5.set(Calendar.MONTH, 13);
		System.out.println("Setting month to 13, then date is: "+calendar5.getTime());
	
	
		Calendar calendar6 = Calendar.getInstance();
		System.out.println("Date: "+calendar6.getTime());
		
		calendar6.set(Calendar.HOUR, 5);
		System.out.println("Setting hour to 5, then date is: "+calendar6.getTime());
	
		
		Calendar calendar7 = Calendar.getInstance();
		System.out.println("Date: "+calendar7.getTime());
		
		calendar7.set(Calendar.HOUR_OF_DAY, 15);
		System.out.println("Setting hour of day to 15, then date is: "+calendar7.getTime());
	
	
		Calendar calendar8 = Calendar.getInstance();
		System.out.println("Date: "+calendar8.getTime());
		
		calendar8.set(Calendar.MINUTE, 55);
		System.out.println("Setting minute to 55, then date is: "+calendar8.getTime());
		
		
		Calendar calendar9 = Calendar.getInstance();
		System.out.println("Date: "+calendar9.getTime());
		
		calendar9.set(Calendar.SECOND, 55);
		System.out.println("Setting second to 55, then date is: "+calendar9.getTime());
	
		
		Calendar calendar10 = Calendar.getInstance();
		System.out.println("Date: "+calendar10.getTime());
		
		calendar10.set(Calendar.YEAR, 2030);
		System.out.println("Setting year to 10, then date is: "+calendar10.getTime());
	}
}
