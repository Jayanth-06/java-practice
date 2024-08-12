package com.java.oops;

public class PrintedBook extends Book{
	int numPages;
	 public PrintedBook() {
		 
	 }
	public PrintedBook(String title, String author,int numPages) {
		super(title, author);
		this.numPages = numPages;
		// TODO Auto-generated constructor stub
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" numsPages : " + numPages);
	}
	 
	 

}
