package com.chainsys.Evaluation2;

public class BankImpl implements Bank {

	@Override
	public void Bank1() {
		double totalAmountDeposited=1000;
		double rateOfIntrest=0.4;
		double totalAmountonIntrest = totalAmountDeposited * rateOfIntrest;
		double totalAmount=totalAmountDeposited+totalAmountonIntrest;
		System.out.println("totalAmountonIntrest: "+totalAmountonIntrest);
		System.out.println("totalAmountDeposited: "+totalAmountDeposited);
		System.out.println("totalAmount: "+totalAmount);
		
	}

	@Override
	public void Bank2() {
		double totalAmountDeposited=2000;
		double rateOfIntrest=0.6;
		double totalAmountonIntrest = totalAmountDeposited * rateOfIntrest;
		double totalAmount=totalAmountDeposited+totalAmountonIntrest;
		System.out.println("totalAmountonIntrest: "+totalAmountonIntrest);
		System.out.println("totalAmountDeposited: "+totalAmountDeposited);
		System.out.println("totalAmount: "+totalAmount);
	
		
	}

	@Override
	public void Bank3() {
		double totalAmountDeposited=3000;
		double rateOfIntrest=0.5;
		double totalAmountonIntrest = totalAmountDeposited * rateOfIntrest;
		double totalAmount=totalAmountDeposited+totalAmountonIntrest;
		System.out.println("totalAmountonIntrest: "+totalAmountonIntrest);
		System.out.println("totalAmountDeposited: "+totalAmountDeposited);
		System.out.println("totalAmount: "+totalAmount);
		
		
	}

}
