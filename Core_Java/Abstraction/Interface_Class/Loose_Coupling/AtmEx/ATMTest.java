package com.Xworkz.Core_Java.Abstraction.Interface_Class.Loose_Coupling.AtmEx;

public class ATMTest {
	public static void main (String args[]) {
		
		SBI sbi = new SBI ();
		HDFC hdfc = new HDFC ();
		ATM atm = new ATM ();
		
		atm.swipe(hdfc);
		atm.swipe(sbi);
	}

}
