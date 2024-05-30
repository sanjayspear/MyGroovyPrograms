package com.test.oops

// Main class to test the implementation
class MainApp {
	static void main(String[] args) {
		// Create instances of Dog and Cat
		Animal dog = new Dog("Buddy")
		Animal cat = new Cat("Whiskers")

		// Display information and make sounds
		dog.displayInfo()
		dog.makeSound()

		cat.displayInfo()
		cat.makeSound()
	}
}

