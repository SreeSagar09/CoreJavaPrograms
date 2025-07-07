package com.app.optionalclass;

import java.util.Optional;
import java.util.function.Function;

import com.app.models.Computer;
import com.app.models.Employee;

public class OptionalClassProgram10 {
	public static void main(String[] args) {
		Optional<Computer> computerOptional1 = Optional.of(new Computer("Dell", "Latitude", "Nvidia", "8Gb", "1Tb", 65000d, 
				Optional.of("HDD"), Optional.of("2Gb-AMD")));
		
		Optional<Computer> computerOptional2 = Optional.of(new Computer("Lenovo", "ThinkPad", "Intel - I5", "8Gb", "500Gb", 45000d, 
				Optional.ofNullable(null), Optional.ofNullable("2Gb-AMD")));
		
		Function<Computer, Optional<String>> romOrHardDiskTypeOptionalFunction = new Function<Computer, Optional<String>>() {
			@Override
			public Optional<String> apply(Computer computer) {
				return computer.getRomOrHardDiskType();
			}
		};
		
		Optional<String> stringOptional1 = computerOptional1.flatMap(romOrHardDiskTypeOptionalFunction);
		
		System.out.println("----- flatMap method with non-null optional value -----");
		System.out.println(stringOptional1);
		
		Optional<String> stringOptional2 = computerOptional2.flatMap(romOrHardDiskTypeOptionalFunction);
		
		System.out.println("----- flatMap method with null optional value -----");
		System.out.println(stringOptional2);
	}	
}
