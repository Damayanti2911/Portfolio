package com.practice.oop.Day4;

public class main {
	public static void main(String args[]) {
		Shape cir= new circle();
		double a= cir.area(4, 0);
		cir.display(a);
		
		Shape rec= new rectangle();
		double ar= rec.area(5, 2);
		cir.display(ar);
	
		document doc= new document();
		doc.print();
		image img = new image();
		img.print();
		
		UPIPayment upi= new UPIPayment();
		upi.authenticate();
		upi.pay();
		upi.generatereceipt();
	}
}
