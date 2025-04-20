package com.practice.oop.Day3;

public class Person {
	private String name;
	private int age;
	
	Person (String name, int age){
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("name "+name + " age "+ age);
		
	}
	

}


