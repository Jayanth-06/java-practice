package com.java.oops;

public class Ebook extends Book {
	double filesize;

	public Ebook() {
	}

	public Ebook(String title, String author, double filesize) {
		super(title, author);
		this.filesize = filesize;
		// TODO Auto-generated constructor stub
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" filesize : " + filesize);
	
	
	
	}

}
