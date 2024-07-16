package com.chainsys.problems;
import java.util.Scanner;
import java.util.*;
public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter company name: ");
        String companyName = scanner.nextLine();

        System.out.print("Enter number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); 

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter designation: ");
            String designation = scanner.nextLine();
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            employees[i] = new Employee(id, name, designation, salary);
        }

        Company company = new Company(companyName, employees, numEmployees);

        System.out.println("Average salary: " + company.getAverageSalary());
        System.out.println("Max salary: " + company.getMaxSalary());



        System.out.println("Enter to search");
        String searchDesignation=scanner.next();
        System.out.println("Employees with designation: " + searchDesignation);
        for (Employee employee : company.getEmployeesByDesignation(searchDesignation)) {
            System.out.println(employee);
        }

        scanner.close();
    }
}
