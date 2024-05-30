package com.test.oops

// Concrete class that extends the abstract class
class Dog extends Animal {

	// Constructor
	Dog(String name) {
		super(name)
	}

	// Implement the abstract method
	@Override
	void makeSound() {
		println("Bark!")
	}
}

// Another implementation class
class Cat extends Animal {

	// Constructor
	Cat(String name) {
		super(name)
	}

	// Implement the abstract method
	@Override
	void makeSound() {
		println("Meow!")
	}
}

