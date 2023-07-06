package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {
	// 제어
	public void start() {
		//1. 학생정보 생성 -> makeStudents
		//2. 학생정보 출력 -> view에서 출력
		//3. 프로그램 종료 -> 종료 누를때까지 반복
		Scanner sc = new Scanner(System.in);
		int select=0;
		StudentService studentService = new StudentService();
		StudentView studentView = new StudentView();
		Student [] students = null;
		
		while(true){
			System.out.println("1.학생정보생성");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.프로그램종료");
			select = sc.nextInt();
			
			if(select==1) {
				students = studentService.makeStudent();
			}else if(select==2) {
				studentView.view(students);// 2번을 먼저 누르면 nullpoint 오류가 남
				
			}else if(select==3) {
				Student student = studentService.findByNum(students);
				studentView.view(student);
				
			}else {
				System.out.println("종료 합니다.");
				break;
			}
		}
	}
}
