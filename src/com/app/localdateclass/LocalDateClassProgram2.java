package com.app.localdateclass;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateClassProgram2 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2026, Month.SEPTEMBER, 30);
		LocalDate ld2 = LocalDate.of(2027, 1, 2);
		LocalDate ld3 = LocalDate.of(2027, 01, 02);
		
		System.out.println(ld);
		System.out.println(ld2);
		System.out.println(ld3);
	}
}
