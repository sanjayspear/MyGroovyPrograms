package com.test.demo

def printHello() {
	println "Hello..."
}

printHello()

def int printSum(int a, int b) {
	int sum = a + b;
	return sum;
}

int totalSum = printSum(10, 20);
println "Total Sum Is "+totalSum