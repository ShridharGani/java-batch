package com.Xworkz.Core_Java.Encapsulation;

public class StudentDetails {
	public static void main(String args[]) {
		
		Student student = new Student();
		
		student.setName("Vishnu");
		student.setUsn("ME085");
		student.setBranch("Mechanical Engineering");
		student.setCollege("XWorkz");
		
		System.out.println("Student Name : "+ student.getName());
		System.out.println("Student USN : "+ student.getUsn());
		System.out.println("Student Branch : "+ student.getBranch());
		System.out.println("Student College : "+ student.getCollege());
		
		
	}

}
