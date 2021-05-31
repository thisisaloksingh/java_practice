package com.util.code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class UtilPractice2Collection {

	public static void main(String[] args) {

		// Using Collection
		Collection col = new ArrayList();
		System.out.println(col);
		System.out.println("Size :" + col.size());
		System.out.println("Empty :" + col.isEmpty());
		System.out.println();

		col.add("Test-1");
		col.add("Test-2");
		col.add("Test-3");
		col.add("Test-4");
		col.add("Test-5");
		System.out.println(col);
		System.out.println("Size :" + col.size());
		System.out.println("Empty :" + col.isEmpty());

		// remove-contains-size
		System.out.println();
		System.out.println(col.contains("Test-1"));
		System.out.println(col.remove("Test-1"));
		System.out.println(col);

		// Object array
		System.out.println();
		Object object[] = col.toArray();
		for (int syso = 0; syso < object.length; syso++) {
			System.out.println(object[syso]);
			object[syso] = "Test-1";
		}
		System.out.println(col);
		col.add("Test-1");

		// Iterator
		Iterator it = col.iterator();
		System.out.println();
		while (it.hasNext()) {
			Object object2 = (Object) it.next();
			System.out.println(object2);
			if (object2.equals("Test-1")) {
				it.remove();
			}
			System.out.println(col);
		}
		
		
		//new col to old one 
		Collection  col1=new ArrayList();
		col1.add("Test-c2-1");
		col1.add("Test-c2-2");
		col1.add("Test-c2-3");
		col1.add("Test-c2-4");
		col1.add("Test-c2-5");
		col1.add("Test-c2-6");
		System.out.println();
		System.out.println("Collection-2 :"+col1);
		col.add(col1);
		System.out.println(col);
		System.out.println(col1.size());
		System.out.println(col.size());
		
		//col3
		Collection col3=new ArrayList<>();
//		col3.add("Test-c3-1");
//		col3.add("Test-c3-2");
//		col3.add("Test-c3-3");
//		col3.add("Test-c3-4");
//		col3.add("Test-c3-5");
//		col3.add("Test-c3-6");
		col3.add("Test-c2-1");
		col3.add("Test-c2-2");
		col3.add("Test-c2-3");
		col3.add("Test-c2-4");
		System.out.println();
		System.out.println(col3);
		System.out.println(col1.containsAll(col3));
		col3.add(col1);
//		System.out.println(col3.removeAll(col1));
		System.out.println(col3);
		System.out.println(col3.contains(col1));
		System.out.println(col.contains(col1));
		System.out.println(col.containsAll(col1));
		
		//remove
		col3.remove(col1);
		System.out.println(col3);
//		System.out.println(col1.removeAll(col3));
		System.out.println(col1);
		System.out.println(col3);
		
		
		Collection col4=new ArrayList<>();
		col4.add("Test-c3-1");
		col4.add("Test-c3-2");
		col4.add("Test-c3-3");
		col4.add("Test-c3-4");
		col4.add("Test-c3-5");
		col4.add("Test-c3-6");
		col4.add("Test-c2-4");
		//retain
		System.out.println();
//		System.out.println(col1.retainAll(col3));
		System.out.println(col1);
//		System.out.println(col3.retainAll(col1));
		System.out.println(col3);
		
//		col4
		System.out.println();
		System.out.println(col4);
		System.out.println(col3);
		System.out.println(col4.retainAll(col3));
//		System.out.println(col3.retainAll(col4));
		System.out.println(col4);
		System.out.println(col3);
//		System.out.println(col4);
//		
		
	}

}
