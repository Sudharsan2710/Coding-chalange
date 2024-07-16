package com.chainsys.Evaluation4;

import java.util.Scanner;


public class MyClass {

	public static int findCountOfEmployeesTransport(Employee[] employees, String branch) {
        int count = 0;
        for (Employee emp : employees) {
            if (emp.getBranch().equals(branch) && emp.isCompanyTransport()) {
                count++;
            }
        }
        return count;

    }

    public static Employee EmployeeRating(Employee[] employees) {
        if (employees.length < 2) {
            return null;
        }

        Employee highestEmployee = null;
        Employee secondHighestEmployee = null;

        for (Employee emp : employees) {
            if (!emp.isCompanyTransport()) {
                if (highestEmployee == null || emp.getRating() > highestEmployee.getRating()) {
                    secondHighestEmployee = highestEmployee;
                    highestEmployee = emp;
                } else if (secondHighestEmployee == null || emp.getRating() > secondHighestEmployee.getRating()) {
                    secondHighestEmployee = emp;
                }
            }
        }

        return secondHighestEmployee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the no of employee :");
        n = scanner.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your employeeId:");
            int employeeId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your employee name:");
            String name = scanner.nextLine();
            System.out.println("Enter your branch name:");
            String branch = scanner.nextLine();
            System.out.println("Enter your rating");
            double rating = scanner.nextDouble();
            System.out.println("Are u using transport are not True or False:");
            boolean companyTransport = scanner.nextBoolean();
            employees[i] = new Employee(employeeId, name, branch, rating, companyTransport);
        }
        System.out.println("Enter the branch input:");
        String branchInput = scanner.next();

        int count = findCountOfEmployeesTransport(employees, branchInput);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("no such employees are not used transport for this branch");
        }
        Employee secondHighestEmployee = EmployeeRating(employees);
        if (secondHighestEmployee != null) {
            System.out.println(secondHighestEmployee.getEmployeeId());
            System.out.println(secondHighestEmployee.getName());
        } else {
            System.out.println("All Employees using company transport");
        }

        scanner.close();
    }
}
