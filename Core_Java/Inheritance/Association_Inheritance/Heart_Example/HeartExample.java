package com.Xworkz.Core_Java.Inheritance.Association_Inheritance.Heart_Example;

public class HeartExample {
	public static void main(String[] args){
		
		Human Vishnu = new Human();
		
		Vishnu.Heart = new Heart();
		
		System.out.println("Patient Name : "+ Vishnu.Name);
		System.out.println("Patient's Age : "+ Vishnu.Age);
		System.out.println("Patient's Gender : "+ Vishnu.Gender);
		
		System.out.println("=>" + Vishnu.Heart.Name);
		System.out.println("Pulse Rate : "+ Vishnu.Heart.PulseRate);
		System.out.println("Medication Intake : "+ Vishnu.Heart.MedicationIntake);
		System.out.println("Heart Condition : "+ Vishnu.Heart.HeartCondition);
	}

}
