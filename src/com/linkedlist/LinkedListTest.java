package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Iterator it=list.iterator();
		
		while(it.hasNext()){
			if (it.next()!="C") {
				list.remove();
			}
			System.out.println(it.next());
		}
		
		
		
	}

}
