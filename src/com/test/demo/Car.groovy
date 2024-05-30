package com.test.demo

class Car {
	String name, color;
	int model;
	
	def getCarDetails() {
		println "You are driving $color color $name and it's model is $model"
	}
	
	def startEngine() {
		println "Engine of the $name car has started smoothly"
	}
	
	static void main(args) {
		Car benz = new Car();
		benz.name = "Benz S-Class"
		benz.color = "Midnight Black Metallic"
		benz.model = 2025
		
		Car audi = new Car();
		audi.name = "Audi e-tron GT"
		audi.color = "Glacier White Metallic"
		audi.model = 2024
		
		Car bmw = new Car();
		bmw.name = "BMW M8 Gran Coupe"
		bmw.color = "Sapphire Black Metallic"
		bmw.model = 2024
		
		benz.getCarDetails()
		audi.getCarDetails()
		bmw.getCarDetails()
	}
}
