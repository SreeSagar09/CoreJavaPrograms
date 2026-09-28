package com.app.localdateclass;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateClassProgram3 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.ofYearDay(2026, 1);
		LocalDate ld2 = LocalDate.ofYearDay(2026, 360);
		LocalDate ld3 = LocalDate.ofInstant(Instant.now(), ZoneId.of("Australia/Sydney"));
		
		/* The epochDay means simply number of days from 1970-01-01*/
		/* The negative days indicate number of days before the 1970-01-01 */
		LocalDate ld4 = LocalDate.ofEpochDay(0);
		LocalDate ld5 = LocalDate.ofEpochDay(-1);
		LocalDate ld6 = LocalDate.ofEpochDay(20500);
		
		System.out.println(ld);
		System.out.println(ld2);
		System.out.println(ld3);
		System.out.println(ld4);
		System.out.println(ld5);
		System.out.println(ld6);
	}
}
