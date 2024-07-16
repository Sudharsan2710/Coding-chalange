package com.chainsys.Evaluation3;

public class Manager  extends Member{
	String department;
	 Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	        this.department = department;
	    }
	    
	    void printDetails() {
	        System.out.println("Manager Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Address: " + address);
	        System.out.println("Department: " + department);
	        printSalary();
	    }
	}


