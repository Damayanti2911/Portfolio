package com.practice.oop.Day3;

public class Student extends Person {
	private String Schname;
	
	Student(String Schname,String Name,int age) {
		super(Name, age);
		this.Schname=Schname;
	}
	public void display() {
		super.display();
		System.out.println("Schname "+Schname);
		
	}
	

}



