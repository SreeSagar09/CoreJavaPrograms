package com.app.calendarclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClassProgram3 {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Calendar calendar1 = Calendar.getInstance();
		
		long timeInMillis = calendar1.getTimeInMillis();
		
		System.out.println("Time in millis: "+timeInMillis);
		
		Calendar calendar2 = Calendar.getInstance();
		
		calendar2.setTimeInMillis(1776964413000l);
		
		System.out.println("Millis in Date format: "+simpleDateFormat1.format(calendar2.getTime()));
	}
}
