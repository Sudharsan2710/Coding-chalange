package com.chainsys.problems;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class Validation {
	
	private static final String NAME_REGEX = "^[a-zA-Z]{5,}$";

	private static final String DESIGNATION_REGEX = "^[a-zA-Z]$";

	private static final String SALARY_REGEX = "^[0-9]$";

	public static boolean validateName(String name) {
		return Pattern.matches(NAME_REGEX, name);
	}

	public static boolean validateDesignation(String designation) {
		return Pattern.matches(DESIGNATION_REGEX,designation );
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String accountNumber;
		String IFSC;
		double existingBalance = 7000;
		int withdrawal;
		double balance = 0.0;
		String c;

		while (true) {
			ArrayList<String> name1 = new ArrayList<String>();
			name1.add("Susan");
			name1.add("Rasa");
			name1.add("Vasan");
			System.out.print("Enter your name (min 5 characters, only letters): ");
			name = sc.nextLine();
			if (validateName(name)) {
				if(name1.contains(name)) {
					System.out.println("proceed");
				}else {
					System.out.println("Invalid name. Please try again.");
					name = sc.nextLine();
				}
				break;
			} else {
				System.err.println("Invalid name. Please try again.");
			}
		}

		while (true) {
			ArrayList<String> accNum  = new ArrayList<String>();
			accNum.add("121234567890");
			accNum.add("901234567890");
			accNum.add("789012345678");
			System.out.print("Enter your account number (12 digits, no special characters, cannot start with zero): ");
			accountNumber = sc.nextLine();
			if (validateAccountNumber(accountNumber)) {
			boolean ac = accNum.contains(accountNumber);
				break;
			} else {
				System.err.println("Invalid account number. Please try again.");
			}
		}

		while (true) {
			ArrayList<String> code = new ArrayList<String>();
			code.add("CVBN01234FG");
			code.add("QWER01234HJ");
			code.add("HJKL06789TY");
			System.out.println(
					"Enter the IFSC code having 11code (Starting 4letter with bankname , fifth character 0 , 6 alphanumeric ");
			IFSC = sc.next();
			if (validateIfscNumber(IFSC)) {
				boolean code1=code.contains(IFSC);
				break;
			} else {
				System.err.println("Invalid IFSC Code.Please try again");
			}
		}

		System.out.println("Name: " + name);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("IFSC Code: "+ IFSC );
		System.out.println("Enter the withdraw or deposite");
		c = sc.next();
		while (true) {
			switch (c) {
			case "withdraw":
				System.out.println("Enter the amount to withrawal");
				withdrawal = sc.nextInt();

				balance = existingBalance - withdrawal;
				System.out.println("balance " + balance);
				break;

			case "deposite":
				System.out.println("Enter the Amount to Deposit");
				double deposit = sc.nextDouble();

				double totalSum = deposit + existingBalance;
				System.out.print("The balance amount: " + totalSum);
				break;

			default:
				System.err.println("Enter the Correct Character");
				c = sc.next();
			}
			
		
		}
	}
}
