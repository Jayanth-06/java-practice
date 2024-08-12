package com.java.oops.features;

public abstract class Animal {
	String name ;
	int age ;
	
	public Animal() {
		
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void displayDetails(){
		
		System.out.println(" name : " + name); 
		System.out.println(" age : " + age);
	}
	abstract void makeSound();
	abstract void move();
}
