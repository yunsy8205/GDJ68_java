package com.iu.study4;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Card card = new Card(); //변수에 카드타입을 담을 수 있다.
		
		Card card2 = new Card();
		
		Student student1 = new Student();
		
		student1.gender='여';
		student1.name="winter1";
		
		Student student2=new Student();
		student2.name="iu";
		student2.gender='F';
		
		//출력
		StudentView sv = new StudentView();
//		sv.view(student1);
		
		//배열 생성
		Student [] students= new Student[2];
		students[0]=student1;
		students[1]=student2;
		
		sv.viewAll(students);
	}

}
