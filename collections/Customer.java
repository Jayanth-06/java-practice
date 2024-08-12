package com.java.collections;

public class Customer  {
	private int id;
	private String email;
	private String name;
	
	public Customer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", name=" + name + "]";
	}
	

		
		
		
		
		

}
