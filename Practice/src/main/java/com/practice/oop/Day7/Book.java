package com.practice.oop.Day7;

public class Book {

	private int ID;
	private String  Title;
	private String Author;
	public int getID() {
		return ID;
	}
	public String getTitle() {
		return Title;
	}
	public String getAuthor() {
		return Author;
	}
	public Book(int iD, String title, String author) {
		ID = iD;
		Title = title;
		Author = author;
	}
	@Override
	public String toString() {
		return  ID + " | " + Title + " | " + Author;
	}
	
	
	
	
}
