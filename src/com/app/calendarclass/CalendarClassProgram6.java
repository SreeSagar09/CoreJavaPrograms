package com.app.calendarclass;

import java.util.Calendar;

public class CalendarClassProgram6 {
	public static void main(String[] args) {
		Calendar calendar1 = Calendar.getInstance();
		System.out.println("Date: "+calendar1.getTime());
		
		calendar1.set(Calendar.MONTH, 10);
		System.out.println("Setting month to 10, then date is: "+calendar1.getTime());
	
		
		Calendar calendar2 = Calendar.getInstance();
		System.out.println("Date: "+calendar2.getTime());
		
		calendar2.set(2035, 1, 26);
		System.out.println("Setting year to 2035, month to 1 and date to 28, then date is: "+calendar2.getTime());
	
	
		Calendar calendar3 = Calendar.getInstance();
		System.out.println("Date: "+calendar3.getTime());
		
		calendar3.set(2020, 0, 1, 10, 30);
		System.out.println("Setting year to 2020, month to 0, date to 1, hour to 10 and miniute to 30, then date is: "+calendar3.getTime());
	
		
		Calendar calendar4 = Calendar.getInstance();
		System.out.println("Date: "+calendar4.getTime());
		
		calendar3.set(2029, 10, 1, 16, 55, 55);
		System.out.println("Setting year to 2029, month to 10, date to 1, hour to 16, miniute to 55 and second to 55, then date is: "+calendar3.getTime());
	}
}
