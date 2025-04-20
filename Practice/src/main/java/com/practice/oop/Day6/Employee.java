package com.practice.oop.Day6;

public class Employee {

	private int ID;
	private String Name;
	private int Salaray;
	
	public Employee(int iD, String name, int salaray) {
		super();
		ID = iD;
		Name = name;
		Salaray = salaray;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalaray() {
		return Salaray;
	}

	public void setSalaray(int salaray) {
		Salaray = salaray;
	}

	@Override
	public String toString() {
	    return "[ID=" + ID + ", Name=" + Name + ", Salary=" + Salaray + "]";
	}


}
