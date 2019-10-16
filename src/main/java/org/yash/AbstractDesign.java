package org.yash;

// Java Program to demonstrate the  

// working of Abstract Factory Pattern 

public class AbstractDesign {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.MICRO));
		System.out.println(CarFactory.buildCar(CarType.MINI));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}
}
