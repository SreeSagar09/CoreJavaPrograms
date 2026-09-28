package com.app.localdateclass;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateClassProgram1 {
	public static void main(String[] args) {
		/* It is internally uses system clock default time zone */
		LocalDate ld = LocalDate.now();
		LocalDate ld2 = LocalDate.now(ZoneId.of("Australia/Sydney"));
		LocalDate ld3 = LocalDate.now(Clock.system(ZoneId.of("America/Chicago")));
		
		System.out.println("LocalDate with system clock: "+ld);
		System.out.println("LocalDate with zone id: "+ld2);
		System.out.println("LocalDate with clock: "+ld3);
	}
}
