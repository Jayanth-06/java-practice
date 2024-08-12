package com.java.oops.features;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dog1 = new Dog("jhony",12);
		dog.displayDetails();
		dog1.displayDetails();
		dog1.makeSound();
		dog1.move();
		
		Bird bird = new Bird();
		Bird bird1 = new Bird("parrot",10);
		bird.displayDetails();
		bird1.displayDetails();
		bird1.makeSound();
		bird1.move();
		
		

	}

}
