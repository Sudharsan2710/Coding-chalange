
package com.chainsys.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Company {
	private String companyName;
	private Employee[] employees;
	private int numEmployees;

	public Company(String companyName, Employee[] employees, int numEmployees) {
		this.companyName = companyName;
		this.employees = employees;
		this.numEmployees = numEmployees;
	}

	public double getAverageSalary() {
		double totalSalary = 0;
		for (Employee employee : employees) {
			totalSalary = totalSalary +  employee.getSalary();
		}
		return totalSalary / numEmployees;
	}

	public double getMaxSalary() {
		double maxSalary = 0;
		for (Employee employee : employees) {
			if (employee.getSalary() > maxSalary) {
				maxSalary = employee.getSalary();
			}
		}
		return maxSalary;
	}

//	public Employee[] getEmployeesByDesignation(String designation) {
//		Employee[] designatedEmployees = new Employee[numEmployees];
//		int count = 0;
//		for (Employee employee : employees) {
//			if (employee.getDesignation().equalsIgnoreCase(designation)) {
//				designatedEmployees[count++] = employee;
//			}
//		}
//		Employee[] result = new Employee[count];
//		System.arraycopy(designatedEmployees, 0, result, 0, count);
//		return result;
//	}
	
	public List<Employee> getEmployeesByDesignation(String designation ){
		List<Employee> result = new ArrayList<>();
		for(Employee employee : employees) {
			if(employee.getDesignation().equalsIgnoreCase(designation)) {
				result.add(employee);
			}
		}
		return result;
		
	}
}
