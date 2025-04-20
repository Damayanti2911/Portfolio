package com.practice.oop.Day3;

public class main {
	public static void main(String args[]) {
		Student s1= new Student("MKSSS","Dam",17);
		s1.display();
		
		Vehicle v2= new Car();
		v2.Start();
		
		
		
		Bank[] bank= new Bank[2];
		
		bank[0]= new HDFC();
		bank[1]= new SBI();
		
		for (Bank b : bank) {
			b.getInterestRate();
			
			
		}
	}
}
