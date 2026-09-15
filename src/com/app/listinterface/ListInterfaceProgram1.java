package com.app.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceProgram1 {
	public static void main(String[] args) {
		/* ArrayList is the one of the implementation class of List interface */
		List<String> strList = new ArrayList<>();
		
		strList.add("A"); /* To add element to the end of the list */
		strList.add("B");
		strList.add("C");
		
		strList.add(2, "BB"); /* To insert element at specific position */
		strList.add(4, "D");
		strList.add(strList.size(), "E");
		
		System.out.println(strList);
	}
}
