package com.practice.oop.Day4;

import java.util.*;

public class Arraylist {

	public static void main(String args[]) {
		List<String> Sname = new ArrayList();
		Sname.add("Dam");
		Sname.add("Rohit");
		Sname.add("Dam");
		Sname.add("Kiran");
		System.out.println(Sname);
		
		
		Set<String> cityname= new HashSet();
		cityname.add("Pune");
		cityname.add("SATARA");
		cityname.add("Pune");
		
		System.out.println(cityname);
		
		Set<Integer> marks= new TreeSet();
		marks.add(60);
		marks.add(10);
		marks.add(90);
		marks.add(25);

		System.out.println(marks);
		
		
		Map<Integer, String> Student= new HashMap<>();
		student s= new student(1, "Dam");
		student v= new student(2, "ggg");

		Student.put(s.ID,s.name);
		Student.put(v.ID,v.name);
		System.out.println(Student);
		
		for (Integer i : Student.keySet()) {
			System.out.println("ID: " + i + ", Name: " + Student.get(i));
		}   
		
		for (Map.Entry<Integer, String> j : Student.entrySet()) {
			System.out.println("ID: " + j.getKey() + ", Name: " + j.getValue());
		}  
		
	}
	
	
	
}
