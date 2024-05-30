package com.test.oops

class Student {
	String name
	int physicsMark, chemistryMark, mathMark
	
	def studentDetail() {
		println "$name has total marks = "+(physicsMark+chemistryMark+mathMark)+" out of 300"
	}
	
	public static void main(args) {
		Student student1 = new Student()
		student1.name = "Rajath"
		student1.mathMark = 95
		student1.physicsMark = 98
		student1.chemistryMark = 94
		
		student1.studentDetail();
		
		Student student2 = new Student()
		student2.name = "Chirag"
		student2.mathMark = 66
		student2.physicsMark = 61
		student2.chemistryMark = 58
		
		student2.studentDetail();
	}
}
