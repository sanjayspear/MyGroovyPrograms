package com.test.oops

// Abstract class
abstract class Animal {
	String name

	// Constructor
	Animal(String name) {
		this.name = name
	}

	// Abstract method
	abstract void makeSound()

	// Concrete method
	void displayInfo() {
		println("Animal Name: $name")
	}
}

