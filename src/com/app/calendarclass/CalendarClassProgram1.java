package com.app.calendarclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarClassProgram1 {
	public static void main(String[] args) {
		String dateAndTimeFormat = "yyyy-MMM-dd HH:mm:ss z";
		
		Calendar calendar1 = Calendar.getInstance();
		
		Locale locale1 = Locale.CHINESE;
		Calendar calendar2 = Calendar.getInstance(locale1);
		
		TimeZone timeZone1 = TimeZone.getTimeZone("Australia/Melbourne");
		Calendar calendar3 = Calendar.getInstance(timeZone1);
		
		Locale locale2 = Locale.FRENCH;
		TimeZone timeZone2 = TimeZone.getTimeZone("America/New_York");
		Calendar calendar4 = Calendar.getInstance(timeZone2, locale2);
		
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(dateAndTimeFormat);
		simpleDateFormat1.setTimeZone(calendar1.getTimeZone());
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(dateAndTimeFormat);
		simpleDateFormat2.setTimeZone(calendar2.getTimeZone());
		
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(dateAndTimeFormat);
		simpleDateFormat3.setTimeZone(calendar3.getTimeZone());
		
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(dateAndTimeFormat);
		simpleDateFormat4.setTimeZone(calendar4.getTimeZone());
		
		System.out.println("Date: "+simpleDateFormat1.format(calendar1.getTime()));
		System.out.println("Date: "+simpleDateFormat2.format(calendar2.getTime()));
		System.out.println("Date: "+simpleDateFormat3.format(calendar3.getTime()));
		System.out.println("Date: "+simpleDateFormat4.format(calendar4.getTime()));
	}
}
