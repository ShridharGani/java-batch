package com.Xworkz.Core_Java.Polymorphism.Overriding.FruitEx;

public class Fruitoverriding {
	public static void main (String args[]) {
		Fruit fruit = new Fruit();
		Mango mango = new Mango();
		Gooseberry gooseberry = new Gooseberry();
		
		System.out.println("Fruit is " + fruit.TasteOfFruit());
		System.out.println("Gooseberry is " + gooseberry.TasteOfFruit());
		System.out.println("Mango is " + mango.TasteOfFruit());
	}

}
