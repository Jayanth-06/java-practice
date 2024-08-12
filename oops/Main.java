package com.java.oops;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book("Shivaji","jayanth");
		Ebook ebook = new Ebook("Shivaji","jayanth",26.69);
		//ebook.displayInfo();
		PrintedBook printedbook = new PrintedBook("Shivaji","jayanth",69);
		//printedbook.displayInfo();
		LibraryServices ls = new LibraryServices();
		ls.displayInfo(ebook);
	}

}
