package com.java.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeServices {
	private EmployeeRepository employeeRepository;

	public EmployeeServices(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getEmployee(){
		return this.employeeRepository.getEmployee();
		
	}
	public  List<Employee> filterBySalary(double minSalary){
		return this.employeeRepository.getEmployee().stream()
				                                    .filter(employee -> employee.getSalary() >= minSalary)
				                                    .collect(Collectors.toList());
		
		
	}
	public List<String> filterByEmail(){
		return this.employeeRepository.getEmployee().stream().map(Employee::getEmail).collect(Collectors.toList());
	}
	/*public List<Employee> sortedEmployee(){
		return this.employeeRepository.getEmployee().stream().sorted(employee1,employee2) -> Integer.compare(employee1.getAge()),employee2.getAge()).collect(Collectors.toList());
	}*/
	 public List<Employee> removeDuplicateEmployeesByID(){
	        return this.employeeRepository.getEmployee().stream()
	                .distinct()
	                .collect(Collectors.toList());
	    }

	    public List<Employee> getFirst3Employees(){
	        return this.employeeRepository.getEmployee().stream()
	                .limit(3)
	                .collect(Collectors.toList());
	    }

	    public List<Employee> skip2Employees(){
	        return this.employeeRepository.getEmployee().stream()
	                .skip(2)
	                .collect(Collectors.toList());
	    }

	    public List<Employee> peekEmployee(int minSalary){
	        return this.employeeRepository.getEmployee().stream()
	                .peek(e -> System.out.println("Original: " + e))
	                .filter(e -> e.getSalary() > 55000)
	                .peek(e -> System.out.println("Filtered: " + e))
	                .peek(e -> System.out.println("Increased Salary: " + e))
	                .collect(Collectors.toList());
	    }

	    public long countEmployees(){
	        return this.employeeRepository.getEmployee().stream().count();
	    }

	    public boolean anyMatch(int minSalary){
	        return this.employeeRepository.getEmployee().stream()
	                .anyMatch(employee -> employee.getSalary() > minSalary);
	    }

	    public boolean allMatch(){
	        return this.employeeRepository.getEmployee().stream()
	                .allMatch(employee -> employee.getDepartment().equals("IT"));
	    }

	    public boolean noneMatch(int minSalary){
	        return this.employeeRepository.getEmployee().stream()
	                .noneMatch(employee -> employee.getSalary() < 20000);
	    }

	    public Optional<Employee> firstEmployee(){
	       return this.employeeRepository.getEmployee().stream().findFirst();
	    }

	    public Optional<Employee> anyEmployee(){
	        return this.employeeRepository.getEmployee().stream().findAny();
	    }
		public void displayDetails() {
			this.employeeRepository.getEmployee().stream().forEach(employee ->{
				System.out.println("ID : " + employee.getId());
				System.out.println("department : " + employee.getDepartment());
			});
		}
		
		public Employee getEmployeeById(int id) throws EmployeeNotFoundException{
			Optional<Employee> optional = this.employeeRepository.getEmployeeById(id);
			if(optional.isPresent())
				return optional.get();
			else 
				throw new EmployeeNotFoundException("EMployee not found with id : " + id);
			
		}
		
	
	}
