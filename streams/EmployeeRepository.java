package com.java.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class EmployeeRepository {
	private List<Employee> employeelist;

	public EmployeeRepository() {
		this.employeelist = new ArrayList<>();
		employeelist.add(new Employee(101, "John Doe", "johndoe@example.com", "Engineering", 75000, 28));
        employeelist.add(new Employee(102, "Jane Smith", "janesmith@example.com", "Marketing", 68000, 32));
        employeelist.add(new Employee(103, "Michael Johnson", "michaeljohnson@example.com", "Finance", 82000, 45));
        employeelist.add(new Employee(104, "Emily Davis", "emilydavis@example.com", "HR", 56000, 29));
        employeelist.add(new Employee(105, "David Wilson", "davidwilson@example.com", "Sales", 73000, 38));
        employeelist.add(new Employee(106, "Emma Brown", "emmabrown@example.com", "Support", 60000, 31));
        employeelist.add(new Employee(107, "Oliver Martinez", "olivermartinez@example.com", "IT", 91000, 41));
        employeelist.add(new Employee(108, "Sophia Taylor", "sophiataylor@example.com", "Operations", 64000, 26));
        employeelist.add(new Employee(109, "James Anderson", "jamesanderson@example.com", "Research", 77000, 34));
        employeelist.add(new Employee(110, "Ava Thomas", "avathomas@example.com", "Product", 69000, 30));
	}
	public List<Employee> getEmployee(){
		return this.employeelist;

	}
	public Optional<Employee> getEmployeeById(int id){
		return this.employeelist.stream().filter(employee -> employee.getId() == id).findFirst();
	}
	

}
