package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Student {
   String name; 
   int age; 
   int id; 
   public String getName() {
      return name; 
   } 
   public int getAge() { 
      return age; 
   } 
   public int getId() { 
      return id; 
   } 
   Student(String n, int a, int i){ 
      name = n; 
      age = a; 
      id = i; 
   } 
   @Override public String toString() {     
      return ("Student[ "+"Name:"+this.getName()+             
              " Age: "+ this.getAge() +                     
              " Id: "+ this.getId()+"]"); 
   }
}
public class StudentStream {
   public static void main(String[] args) {
	   
	   for(int[] a=0;)
      List<Student> studentlist = new ArrayList<Student>();
      studentlist.add(new Student("Jon", 22, 1001)); 
      studentlist.add(new Student("Steve", 19, 1003)); 
      studentlist.add(new Student("Kevin", 23, 1005)); 
      studentlist.add(new Student("Ron", 20, 1010)); 
      studentlist.add(new Student("Lucy", 18, 1111));
      
//      studentlist.stream().collect(Collectors.groupingBy(Collectors.counting());
      
      
      
      
      
      
      
      System.out.println("Before Sorting the student data:"); 
      Collections.reverse(studentlist);
      System.out.println(studentlist);
//      long[] a ={1,2,3,4,5,5};
//      ArrayList<Long> l=Arrays.asList(a);
 
      //java 8 forEach for printing the list 
      studentlist.forEach((s)->System.out.println(s));

      System.out.println("After Sorting the student data by Age:"); 

      //Lambda expression for sorting by age 
      studentlist.sort((Student s1, Student s2)->s1.getAge()-s2.getAge()); 

      //java 8 forEach for printing the list
      studentlist.forEach((s)->System.out.println(s));         

      System.out.println("After Sorting the student data by Name:"); 
      //Lambda expression for sorting the list by student name       
      studentlist.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName())); 
      studentlist.forEach((s)->System.out.println(s)); 
//      System.out.println(studentlist.stream().filter(s->s.getName().startsWith("L")).map(s->s.getName()).collect(Collectors.toList()));
      System.out.println("After Sorting the student data by Id:");        
      //Lambda expression for sorting the list by student id 
      studentlist.sort((Student s1, Student s2)->s1.getId()-s2.getId()); 
      studentlist.forEach((s)->System.out.println(s)); 
   }
}
