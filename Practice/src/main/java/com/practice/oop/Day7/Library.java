package com.practice.oop.Day7;

import java.util.*;
import java.util.stream.Collectors;

public class Library {

	List<Book> books= new ArrayList<>();
	
	public void AddBook(Book b) {
		books.add(b);
		System.out.println("Book added "+ b.getTitle());
	}
	public void RemoveBook(int ID) {
		books.removeIf(b-> b.getID()==ID);
		System.out.println("Book Removed "+ ID);

	}
	public void SearchTitle(String Title) {
		List<Book> result= books.stream().filter(b-> b.getTitle().toUpperCase().contains(Title.toUpperCase()))
				.collect(Collectors.toList());
		if(result.isEmpty()) {
			System.out.println("Book not found");
		}
		else {
			System.out.println(result);
		}
	}
	public void DisplayAll(){
		if(books.isEmpty()) {
			System.out.println("No Books are there");
			
		}
		else {
			System.out.println(books);
		}
	}
	
}
