package com.test.demo

def num = 10;

if (num == 10) {
	print "num is 10"
}else {
	println "num is not 10"
}
println ""
//Switch Case

def x = 0
def result = ""

switch(x) {
	case 0:
		result = "x is zero"
		break
	case {x > 0}:
		result = "x is +ve"
		break
	case {x < 0}:
		result = "x is -ve"
		break
	default:
	 	result = "Not a number"
}
println result