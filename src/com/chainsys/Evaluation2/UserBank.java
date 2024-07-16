package com.chainsys.Evaluation2;
import java.util.Scanner;
public class UserBank {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	 BankImpl bank = new BankImpl();
	
	 
	 
	 System.out.println("Enter the Num: ");
	 int num=sc.nextInt();
	 switch(num) {
	 case 1:
		 bank.Bank1();
		 break;
	 case 2:
		 bank.Bank2();
		 break;
	 case 3:
		 bank.Bank3();
		 break;
	}

}
}
