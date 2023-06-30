package com.iu.study4;

public class StudentView {
	
	//Student 정보를 출력
	//view
	
	public void view(Student s) {
		System.out.println("성별 : "+s.gender);
		System.out.println("이름 : "+s.name);
	}
	
	// viewAll
    // 모든 student들 정보를 출력
    // 단, viewAll 매개변수는 딱 한개만 선언
	public void viewAll (Student [] student) {
		for(int i=0; i<student.length; i++) {
		System.out.println("성별 : "+student[i].gender);
		System.out.println("이름 : "+student[i].name);
		}
	}
	
}
