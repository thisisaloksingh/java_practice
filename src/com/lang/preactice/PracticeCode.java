package com.lang.preactice;

import java.util.Iterator;
import java.util.TreeSet;

public class PracticeCode {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>();
		ts.add("Java");
		ts.add("Lang");
		ts.add("Util");
		ts.add("Thread");
		
		Iterator it=ts.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}
}
