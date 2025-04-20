package com.practice.oop.Day4;

public class UPIPayment extends Payment implements SecureTransaction {

	@Override
	public void authenticate() {
        System.out.println("UPI PIN authenticated ");

	}

	@Override
	void pay() {
        System.out.println("Payed 550$");

	}

	
}
