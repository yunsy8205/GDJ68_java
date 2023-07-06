package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student findByNum(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 학생의 번호를 입력하세요");
		int num = sc.nextInt();
		
		Student student = null;
		
		for(int i=0;i<students.length;i++) {
			if(num==students[i].getNum()) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	public Student makeStudentOne() {
		//학생 1명 만들어서 이름, 번호, 국어, 영어, 수학
		//총점 평균을 계산
		//학생을 리턴
		Scanner sc = new Scanner(System.in);
		
		Student si = new Student();
		System.out.println("이름 입력 : ");
		si.setName(sc.next());
		System.out.println("번호 입력 : ");
		si.setNum(sc.nextInt());
		System.out.println("국어 입력 : ");
		si.setKor(sc.nextInt());
		System.out.println("영어 입력 : ");
		si.setEng(sc.nextInt());
		System.out.println("수학 입력 : ");
		si.setMath(sc.nextInt());
		si.cal();
		
		return si;
	}
	
	public Student[] makeStudent() {
		//학생수 입력
		//학생수 만큼 학생들이 만들어짐
		//이름, 번호, 국어, 영어 수학 점수 입력
		//총점, 평균 계산
		//학생들을 리턴
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 : ");
		int count = sc.nextInt();
		
		Student[] students = new Student[count];
		
		for(int i=0;i<count;i++) {
			Student si = new Student();
			System.out.println("이름 입력 : ");
			si.setName(sc.next());
			System.out.println("번호 입력 : ");
			si.setNum(sc.nextInt());
			System.out.println("국어 입력 : ");
			si.setKor(sc.nextInt());
			System.out.println("영어 입력 : ");
			si.setEng(sc.nextInt());
			System.out.println("수학 입력 : ");
			si.setMath(sc.nextInt());
			si.cal();
			
			students[i]=si;
			
		}
		
		return students;
		
	}

}
