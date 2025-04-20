package com.practice.oop.Day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {

	public  File() {
	try {
		System.out.println("hi............");
	BufferedWriter bw= new BufferedWriter(new FileWriter("new.txt"));
	bw.write("WELCOME FILE USER");
	bw.newLine();
	bw.write("BYE");
	bw.close();

	
	
	}
	catch(IOException e) {
		System.out.println(e);
	}
	}
	
	public void displayfile(String fname) {
		try {
			BufferedReader br= new  BufferedReader(new FileReader(fname));
			//System.out.println("br.lines();"+br.lines());
			String line;
			while ((line= br.readLine()) !=null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void addSutudent(Student s) {
		try {
			System.out.println("hi............");
		BufferedWriter bw= new BufferedWriter(new FileWriter("student.txt",true));
		bw.write("Student DB");
		bw.newLine();
		bw.write("ID "+s.ID);
		bw.newLine();
		bw.write("Name "+ s.name);
		bw.newLine();
		bw.write("Marks "+ s.marks);
        bw.write("-----");

		bw.newLine();

		bw.close();

		
		
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
