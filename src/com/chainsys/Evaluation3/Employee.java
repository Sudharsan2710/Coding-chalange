package com.chainsys.Evaluation3;

	
	class Employee extends Member {
	    String specialization;
	    
	    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	        this.specialization = specialization;
	    }
	    
	    void printDetails() {
	        System.out.println("Employee Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Address: " + address);
	        System.out.println("Specialization: " + specialization);
	        printSalary();
	    }
	}

	


