package com.test.oops

class GroovyOOPs {
	private String fruitName
	private String fruitColor
	
	def setFruitName(String name) {
		fruitName = name
	}
	
	def setFruitColor(String name) {
		fruitColor = name
	}
	
	def getFruitName() {
		println "Fruit Name is $fruitName"
	}
	
	def getFruitColor() {
		println "Fruit Color is $fruitColor"
	}
	
	public static void main(args) {
		GroovyOOPs fruit = new GroovyOOPs();
		fruit.setFruitName("Apple");
		fruit.setFruitColor("Red");
		
		fruit.getFruitName()
		fruit.getFruitColor()
	}
}
