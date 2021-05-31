package com.lang.preactice;

import java.util.Iterator;
import java.util.TreeSet;

public class PracticeCode2 {
	public static void main(String[] args) {
		System.out.println("PracticeCode2.main() **STUDENT INFO***");
		
		TreeSet ts= new TreeSet();
		ts.add(new Student(11, "Roy"));
		ts.add(new Student(2, "Joy"));
		ts.add(new Student(3, "Cole"));
		ts.add(new Student(4, "David"));
		ts.add(new Student(5, "Christian"));
	
		Iterator it=ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
//		System.out.println(new Student(2, "Roy").compareTo(new Student(2, "Roy")));
		
	}

}
class Student implements Comparable 
{
	
	int sid;
	String name;
	public Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student stud=(Student) o;
			System.out.println("Inside If** :"+this.sid+" ::"+stud.sid);
			return this.sid-stud.sid;
		}
		return 6;
	}
	
	public String toString(){
		return sid+"\t"+name;
	}

}

