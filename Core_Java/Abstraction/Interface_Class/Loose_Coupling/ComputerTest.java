package com.Xworkz.Core_Java.Abstraction.Interface_Class.Loose_Coupling;

public class ComputerTest {
	public static void main (String args[]) {
		
		Sony sony = new Sony();
		Epson epson = new Epson();
		Computer computer = new Computer();
		
		computer.slot(sony);
		computer.slot(epson);
		
	}

}
