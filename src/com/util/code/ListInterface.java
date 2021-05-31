package com.util.code;

import java.util.ArrayList;
import java.util.List;


public class ListInterface {
	
	public static void main(String[] args) {
		List list= new ArrayList<String>();
		list.add("TEST-L-1");
		list.add("TEST-L-4");
		list.add("TEST-L-3");
		list.add("TEST-L-4");
		list.add("TEST-L-5");
		System.out.println(list);
		
		list.add(0, "TEST-L-0");
		System.out.println(list);
		Object ocj=list.get(2);
		System.out.println(ocj);
		
		int x=list.indexOf("TEST-L-4");
		System.out.println(x);
		
		int y=list.lastIndexOf("TEST-L-4");
		System.out.println(y);
		
		List loits2=list.subList(1, 3);
		System.out.println(loits2);
		System.out.println(list.get(0));
		
		
	}

}
