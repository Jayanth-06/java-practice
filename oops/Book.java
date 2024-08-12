package com.java.oops;

public class Book {
	String title;
	String author;
	public Book() {
		super();
		System.out.println("Constructor is called ....");
	}
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public void displayInfo() {
		System.out.println(" title : " + title);
		System.out.println(" author : " + author);
	}
	
	
	
	

}
