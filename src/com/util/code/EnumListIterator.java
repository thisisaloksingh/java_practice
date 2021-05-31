package com.util.code;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class EnumListIterator {

	public static void main(String[] args) {
		Vector v=new Vector<>();
		
		Enumeration enu=v.elements();
//		System.out.println(enu.nextElement());
				
		if (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		v.addElement("Test-v1");
		v.addElement("Test-v2");
		v.addElement("Test-v3");
		v.addElement("Test-v4");
		System.out.println(v);
		enu=v.elements();
		while (enu.hasMoreElements()) {
			Object object = (Object) enu.nextElement();
			System.out.println(object);
		}
		
		
		//Iterator
		System.out.println();
		List list =new ArrayList<>();
		Iterator it =list.iterator();
		
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		list.add("Test-L-it-1");
		list.add("Test-L-it-2");
		list.add("Test-L-it-3");
		list.add("Test-L-it-4");
		System.out.println(list);
//		list.remove("Test-L-it-1");
		
		it=list.iterator();
		int size=list.size();
//		list.remove("Test-L-it-1");		
		System.out.println("Iterating by using for loop !");
		
		for (int i = 0; i < size; i++) {
//			System.out.println(it.next());
		}
		
		System.out.println("Iterating by using Iterator Interface !");
//		list.remove("Test-L-it-1");
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			if (object.equals("Test-L-it-1")) {
				System.out.println("Check list before removing If: "+list);
				it.remove();
				System.out.println("Check list after removing If: "+list);
				
			}
		}
		
		//ListIterator
		System.out.println();
		System.out.println("By Using ListIterator ***");
		ListIterator listit=list.listIterator();
		
		while (listit.hasNext()) {
			Object object = (Object) listit.next();
			System.out.println(object);
			
			if (object.equals("Test-L-it-1")) {
				listit.remove();
			}else {
				if (object.equals("Test-L-it-2")) {
					listit.add("Test-L-it-ADDED");
				}else{
					if (object.equals("Test-L-it-3")) {
						listit.set("Test-L-it-SET");
					}
				}
			}
		}
		System.out.println(list);
		
		
		//Forward and reverse Order
		ListIterator listit1=list.listIterator();
		System.out.println();
		while (listit1.hasNext()) {
			int indx=listit1.nextIndex();
			Object object = (Object) listit1.next();
			System.out.println(indx+":"+object);
		}
		
		ListIterator listit2=list.listIterator();
		while (listit2.hasNext()) {
			listit2.next();
		}
		System.out.println("Reverse order************");
		while (listit2.hasPrevious()) {
			int indx=listit2.previousIndex();
			Object object = (Object) listit2.previous();
			System.out.println(indx+":"+object);
		}
		
		//do while do 
		System.out.println();
		System.out.println("Do WHILE DO*************");
		ListIterator listit3=list.listIterator(2);
		do{
			int indx=listit3.nextIndex();
			Object object =listit3.next();
			System.out.println(indx+":"+object);
		}while(listit3.hasNext());
			System.out.println();
			listit3=list.listIterator(3);
		do{
			int indx=listit3.previousIndex();
			Object object=listit3.previous();
			System.out.println(indx+":"+object);
		}while (listit3.hasPrevious());
		
		
		
		
		
		
		
		
		System.out.println("Main Completed !");
	}

}
