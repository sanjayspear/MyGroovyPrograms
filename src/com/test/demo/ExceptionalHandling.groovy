package com.test.demo

try {
	int i = 1 / 1;
}catch(Exception exp) {
	println "I'm in the catch block"
	println exp.getMessage()
}finally {
	println "I'm inside the finally block"
}