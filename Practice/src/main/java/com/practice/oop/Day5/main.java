package com.practice.oop.Day5;

public class main {

	public static void main (String args[]) {
		try{
			int a= 5/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("In final block ");
		}
		
		String a="7";
		int aI= Integer.parseInt(a);
		System.out.println("a1    " +( aI+10));
	
		StringBuilder sb= new StringBuilder("Hello ");
		sb.append("JAVA ");
		sb.append("Guys");
		System.out.println(sb);
		sb.delete(10, sb.length());
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		StringBuffer sbf= new StringBuffer("Hi ");
		sbf.insert(3, "Girls!");
		System.out.println(sbf);
		sbf.replace(3, sbf.length(), "Boys!");
		System.out.println(sbf);
		sbf.capacity();	
		System.out.println(sbf.capacity());
		
		
		SMSService s1= new SMSService();
		s1.sendSMS("9877667788", "hi there");
		s1.sendSMS("9877667666", "hi guys");
		
		SMSService s2= new SMSService();
		s2.sendSMS("9844444444", "hi");
		
		File f= new File();
		f.displayfile("new.txt");
		
		
		Student s3= new Student(1, "Dam", 90);
		Student s4= new Student(2, "Rohit", 70);
		Student s5= new Student(3, "Kiran", 90);
		Student s6= new Student(4, "Rony", 100);
		System.out.println(s3.ID);
		
		f.addSutudent(s3);
		f.addSutudent(s4);
		f.addSutudent(s5);
		f.addSutudent(s6);
		f.displayfile("student.txt");

		

		
	}
}
