package com.Xworkz.Core_Java.Polymorphism.Overloading;

public class HumanTest {
	public static void main (String args[]) {
	
	Human Shridhar = new Human();
	Unknown unknown = new Unknown();
	Friend friend = new Friend();
	Shridhar.speak(unknown);
	Shridhar.speak(friend);
	}
}
