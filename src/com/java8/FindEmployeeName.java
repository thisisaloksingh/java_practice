package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEmployeeName {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("ALOK", "001"));
		list.add(new Employee("ALOKk", "002"));
		list.add(new Employee("ALOKk", "003"));
		list.add(new Employee("ALOKk", "004"));
		list.add(new Employee("ALOKn", "005"));

		/*
		 * System.out.println(list.stream()
		 * .filter(s->s.getName().startsWith("A")) .map(s->s.getName())
		 * .forEach(System.out::println));
		 */
		list.sort((Employee s1, Employee s2) -> s1.getName().compareTo(s2.getName()));
		list.forEach((s) -> System.out.println(s));
	}
}
