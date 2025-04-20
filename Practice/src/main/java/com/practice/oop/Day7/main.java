package com.practice.oop.Day7;

import java.util.*;

public class main {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Library lib= new Library();
        int choice;
        
        do {
        	System.out.println("WELCOME USER!!! ");
        	System.out.println("1. Add Book ");
        	System.out.println("2. Remove Book ");
        	System.out.println("3. Search Book ");
        	System.out.println("4. Display All Books ");
        	System.out.println("5. Exit");
        	System.out.println("Enter choice: ");
        	choice= sc.nextInt();
        	sc.nextLine();
        	
        	switch(choice) {
        	case 1:
        		System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author: ");
                String author = sc.nextLine();
                lib.AddBook(new Book(id,title,author));
                break;
        	case 2:
        		System.out.print("Enter ID to be removed: ");
                int RID = sc.nextInt();
                lib.RemoveBook(RID);
                break;
        	case 3:
        		System.out.print("Enter Title: ");
                String stitle = sc.nextLine();
                lib.SearchTitle(stitle);
                break;
        	case 4:
        		lib.DisplayAll();
        		break;
        	case 5:
        		System.out.println("Existing....");
        		break;
        	default:
        		System.out.println("Invalid choice!");
        		
        	
        	}
        	
        	
        }while(choice!=5);
        
        
        
	}
}
