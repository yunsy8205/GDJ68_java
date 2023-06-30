package com.iu.study4.s2;

public class S2Main {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
		
		Student s1=ss.makeStudentOne();
		
		System.out.println(s1.avg);
		
		Student[] students = ss.makeStudent();
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].avg);
		}

	}

}
