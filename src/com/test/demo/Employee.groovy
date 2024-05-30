package com.test.demo

// Derived class
class Employee extends Person {
	String employeeId
	String department

	// Constructor for Employee
	Employee(String name, int age, String employeeId, String department) {
		super(name, age) // Call the constructor of the base class
		this.employeeId = employeeId
		this.department = department
	}

	// Method to display employee details
	void displayInfo() {
		super.displayInfo() // Call the base class method
		println("Employee ID: $employeeId")
		println("Department: $department")
	}
}
