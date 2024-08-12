package com.java.collections;

import java.util.HashSet;

public class SetImplementation {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setId(111);
		customer1.setEmail("1bandijayanth06@gmail.com");
		customer1.setName("jayanth");
		
		System.out.println(customer1);
		Customer customer2 = new Customer();
		customer2.setName("jayanth2");
		customer2.setEmail("2bandijayanth06@gmail.com");
		customer2.setId(222);
		
		Customer customer3 = new Customer();
		customer3.setName("jayanth3");
		customer3.setEmail("3bandijayanth06@gmail.com");
		customer3.setId(333);
		
		Customer customer4 = new Customer();
		customer4.setName("jayanth3");
		customer4.setEmail("3bandijayanth06@gmail.com");
		customer4.setId(333);
			
		HashSet<Customer>list = new HashSet<>();
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		
		System.out.println("size : " + list.size());
		System.out.println(list);
		Customer first = list.get(0);
		System.out.println(first);
		
		HashSet<String> arraylist = new HashSet<>();
		
		arraylist.add("jayanth");
		arraylist.add("jai");
		//arraylist.add(111);
		arraylist.add("cbit");
		arraylist.add("Vijaya");
		arraylist.add("srinivas");
		 
		
		
		System.out.println(arraylist.size());
		System.out.println(arraylist);
		//literator<string> iterator = new Iterator<>();
		for(String str :arraylist) {
			System.out.println(str);
		}
		
		

	}

}
