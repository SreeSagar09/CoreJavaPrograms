package com.app.calendarclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarClassProgram2 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Calendar calendar1 = Calendar.getInstance();
		
		Date date1 = simpleDateFormat1.parse("2026-11-30 23:00:05");
		calendar1.setTime(date1);
		
		System.out.println("Date: "+calendar1.getTime());
		
		Calendar calendar2 = Calendar.getInstance();
		Date date2 = calendar2.getTime();
		
		System.out.println("Date: "+date2);
	}
}
