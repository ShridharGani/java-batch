package com.Xworkz.Core_Java.Abstraction.Interface_Class.Multiple_Inheritance;

public class TaxCalculator implements StateTax, CentralTax {
	public void electricityTax() {
		System.out.println("Electricity tax is 50");
	}
	public void incomeTax() {
		System.out.println("Income tax is 100");
	}
	
}
