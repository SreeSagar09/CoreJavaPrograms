package com.app.streaminterface;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamInterfaceProgram29 {
	public static void main(String[] args) {
		Supplier<Long> nanoTimeSupplier = new Supplier<Long>() {
			@Override
			public Long get() {
				return System.nanoTime();
			}
		};
		
		Supplier<String> randomUUIDSupplier = ()->{
			return UUID.randomUUID().toString();
		};
		
		Stream<Long> nanoTimeStream = Stream.generate(nanoTimeSupplier).limit(5);
		
		System.out.println("----- NanoTime stream of long -----");
		nanoTimeStream.forEach(nt->{
			System.out.println(nt);
		});
		
		Stream<String> randomUUIDStream = Stream.generate(randomUUIDSupplier).limit(5);
		
		System.out.println("----- RandomUUID stream of string -----");
		randomUUIDStream.forEach(ru->{
			System.out.println(ru);
		});
	}
}
