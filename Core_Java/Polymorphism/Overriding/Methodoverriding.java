package com.Xworkz.Core_Java.Polymorphism.Overriding;

public class Methodoverriding {
	public static void main (String args[]) {
		RBI rbi = new RBI();
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		
		System.out.println(rbi.GetInterestRate());
		System.out.println(sbi.GetInterestRate());
		System.out.println(hdfc.GetInterestRate());
	}

}
