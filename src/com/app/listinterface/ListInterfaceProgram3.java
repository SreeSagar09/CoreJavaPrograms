package com.app.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceProgram3 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		
		System.out.println("-------- Original list elements ---------");
		System.out.println(strList);
		
		strList.addFirst("AA"); /* To add an element as the first element of the list */
		System.out.println("-------- After using addFirst method --------");
		System.out.println(strList);
		
		strList.addLast("C"); /* To add an element as the last element of the list */
		System.out.println("-------- After using addLast method --------");
		System.out.println(strList);
	}
}
