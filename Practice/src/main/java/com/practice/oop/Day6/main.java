package com.practice.oop.Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class main {

	public static void main(String args[]) {
		List<Integer> number= Arrays.asList(2,3,4,5,6,1,5);
		List<Integer> even = number.stream().filter (n -> n % 2 ==0).collect(Collectors.toList());
		System.out.println(even);
		Runnable r = () -> System.out.println("Hi......");
		r.run();
		
		
		
		List<Employee> emp = new ArrayList();
		emp.add(new Employee(1,"Dam",30000));
		emp.add(new Employee(1,"D2",70000));
		emp.add(new Employee(1,"D3",20000));
		System.out.println(emp);
		int cnt=0;
		List<Employee> e1= emp.stream().filter(n-> n.getSalaray() > 50000).collect(Collectors.toList());
		System.out.println(e1);
		
		emp.forEach(e -> System.out.println("EMP LIST>> ID: " + e.getID() + ", Name: " + e.getName() + ", Salary: " + e.getSalaray()));
		e1.forEach(e -> System.out.println("E1 list>>. ID: " + e.getID() + ", Name: " + e.getName() + ", Salary: " + e.getSalaray()));

		emp.sort((e2,e3) ->  Double.compare(e2.getSalaray(), e3.getSalaray()));
		emp.forEach(e-> System.out.println("Sorted LIST>> "+ e));
		emp.sort((e2,e3) ->  Double.compare(e3.getSalaray(), e2.getSalaray()));
		emp.forEach(e-> System.out.println("Sorted LIST>> "+ e));

		List<String> names= emp.stream().map(e-> e.getName()).collect(Collectors.toList());
		System.out.println(names);
		Optional<Employee> maxep= emp.stream().max(Comparator.comparing(Employee::getSalaray));
		System.out.println(maxep);
		
	}
}
