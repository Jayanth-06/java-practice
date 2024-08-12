package com.java.streams;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		EmployeeServices employeeservices = new EmployeeServices(employeeRepository);
		List<Employee> employeeList = employeeservices.getEmployee();
		//employeeList.forEach(employee -> System.out.println(employee));
        //employeeservices.filterBySalary(70000).forEach(System.out::println);
        //employeeservices.displayDetails();
        /*try {
        	System.out.println(employeeservices.getEmployeeById(100));
        }catch(EmployeeNotFoundException e) {
        	System.out.println(e.getMessage());*/
		//employeeservices.filterByEmail().forEach(System.out::println);	
		System.out.println(employeeservices.countEmployees());
		System.out.println(employeeservices.removeDuplicateEmployeesByID());
		System.out.println(employeeservices.getFirst3Employees());
		System.out.println(employeeservices.peekEmployee(70000));
		System.out.println(employeeservices.allMatch());
        	
        
        
	}

}
