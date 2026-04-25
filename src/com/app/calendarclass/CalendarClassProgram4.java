package com.app.calendarclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarClassProgram4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		Date date = calendar.getTime();
		System.out.println("Date: "+date);
		
		int dateValue = calendar.get(Calendar.DATE);
		int dayOfMonthValue = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeekValue = calendar.get(Calendar.DAY_OF_WEEK);
		int dayOfYearValue = calendar.get(Calendar.DAY_OF_YEAR);
		int monthValue = calendar.get(Calendar.MONTH);
		int eraValue = calendar.get(Calendar.ERA);
		int hourValue = calendar.get(Calendar.HOUR);
		int hourOfDayValue = calendar.get(Calendar.HOUR_OF_DAY);
		int minuteValue = calendar.get(Calendar.MINUTE);
		int secondValue = calendar.get(Calendar.SECOND);
		int millisecondValue = calendar.get(Calendar.MILLISECOND);
		int weekOfMonthValue = calendar.get(Calendar.WEEK_OF_MONTH);
		int weekOfYearValue = calendar.get(Calendar.WEEK_OF_YEAR);
		int yearValue = calendar.get(Calendar.YEAR);
		
		System.out.println("Date value: "+dateValue);
		System.out.println("Day of month value: "+dayOfMonthValue);
		System.out.println("Day of week value: "+dayOfWeekValue);
		System.out.println("Day of year value: "+dayOfYearValue);
		System.out.println("Month value: "+monthValue);
		System.out.println("Era value: "+eraValue);
		System.out.println("Hour value: "+hourValue);
		System.out.println("Hour of day value: "+hourOfDayValue);
		System.out.println("Second value: "+secondValue);
		System.out.println("Minute value: "+minuteValue);
		System.out.println("Millisecond value: "+millisecondValue);
		System.out.println("Week of month value: "+weekOfMonthValue);
		System.out.println("Week of year value: "+weekOfYearValue);
		System.out.println("Year value: "+yearValue);
	}
}
