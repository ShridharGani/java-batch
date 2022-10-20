package com.Xworkz.Core_Java.Inheritance.Association_Inheritance;

public class AssociationInheritance {
	public static void main(String[] args){
	
	Library Vagdevi = new Library();
	
	Vagdevi.Student = new Student();
	
	System.out.println("Library Name : "+ Vagdevi.Name);
	
	System.out.println("Student Name : "+ Vagdevi.Student.Name);
	System.out.println("Student Gender : "+ Vagdevi.Student.Gender);
	System.out.println("Student College : "+ Vagdevi.Student.College);
}
	
}
