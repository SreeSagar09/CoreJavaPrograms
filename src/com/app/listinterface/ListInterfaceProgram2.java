package com.app.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceProgram2 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		
		List<String> strList2 = new ArrayList<>();
		strList.add("AA");
		strList.add("BB");
		
		strList.addAll(strList2); /* To add all of the elements in the specified collection to the end of the list */
		
		List<String> strList3 = new ArrayList<>();
		strList.add("C");
		strList.add("D");
		
		strList.addAll(2, strList3); /* To insert all of the elements in the specified collection into the list at the specified position */
		
		System.out.println(strList);
	}
}
