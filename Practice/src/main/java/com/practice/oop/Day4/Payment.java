package com.practice.oop.Day4;

abstract class Payment {
	abstract void pay();
	public void generatereceipt() {
		System.out.println("Receipt Generated");
	}

}
