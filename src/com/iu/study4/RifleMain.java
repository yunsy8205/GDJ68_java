package com.iu.study4;

import java.util.Scanner;

public class RifleMain {

	public static void main(String[] args) {
		//클래스명 변수명 = new 클래스명(); <- 객체만드는 코드
		Rifle rifle = new Rifle();//보통 변수명을 클래스명의 소문자 형태로 많이씀
		
		
		//멤버들 사용법
		//1. 멤버변수 변수명.멤버변수명
		//2. 멤버메서드 변수명.멤버메서드명()   <- 뒤에 "변수명." 뒤에 이름과()소가로가 붙으면 메서드다.
//		rifle.shoot1();
//		rifle.shoot2();
		
		//Scanner도 클래스이며, 사용자가 지정하지않은 클래스를 라이브러리라고 함.
		Scanner sc = new Scanner(System.in);
		System.out.println("1.단발 2.점사");
		int select = sc.nextInt();
		
		System.out.println("총알 수 입력");
		int b=sc.nextInt();
		
		if(select==1) {
			rifle.shoot1(b);
		}else {
			rifle.shoot2(1,"sss",null);
		}
	}

}
