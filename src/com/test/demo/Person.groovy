package com.test.demo

// Base class
class Person {
	String name
	int age

	// Constructor for Person
	Person(String name, int age) {
		this.name = name
		this.age = age
	}

	// Method to display person details
	void displayInfo() {
		println("Name: $name")
		println("Age: $age")
	}
}
