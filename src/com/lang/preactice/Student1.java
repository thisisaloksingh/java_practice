package com.lang.preactice;

public class Student1 implements Comparable {
	
	int sid;
	String name;
	public Student1(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {

		if (o instanceof Student) {
			Student stud=(Student) o;
			return this.sid-stud.sid;
		}
		return 0;
	}
	
	public String toString(){
		return sid+"\t"+name;
	}

}
