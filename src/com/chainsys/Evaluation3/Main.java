package com.chainsys.Evaluation3;

public class Main {
	   public static void main(String[] args) {
	        Employee employee = new Employee("guru", 28, "9087654321", "123 madurai", 40000, "Software Development");
	        Manager manager = new Manager("raja", 35, "59534585678", "456 simmakal", 80000, "IT Department");
	        
	        employee.printDetails();
	        System.out.println();
	        manager.printDetails();
	    }

}
