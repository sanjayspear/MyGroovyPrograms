package com.test.demo

def myClosure = {println "Hello"}

myClosure.call();

String s = "Mr."
def myClosureWithParam = {FN, LN -> println "$s $FN $LN"}

String t = "Hello"
def helloGroovyClosure = {name -> println "$t $name"}

myClosureWithParam("Sanjay", "Singh")

def myClosureMethod(clos) {
	clos.call("Groovy")
}

myClosureMethod(helloGroovyClosure)


def myClosureAddition = {
	a,b,c -> 
	return (a+b+c)
}

def sum = myClosureAddition(10, 20, 30)
println "Total sum is "+sum