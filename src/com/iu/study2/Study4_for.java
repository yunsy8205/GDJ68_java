package com.iu.study2;

import java.util.Scanner;

public class Study4_for {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			System.out.println("hello");
			
		}// i가 5가 될떄까지 반복되고 5가되면 반복문을 빠져나옴
		
//		int j=567;
//		for(j=0;j<3;j=j+1) {//반복문 변수명을 보통 i,j 많이 씀
//			
//		}
//		for(j=3;j>0;j--) {
//			
//		}
//		
		//-------------------
		Scanner sc = new Scanner(System.in);
		
		//hello 출력
		//키보드로부터 출력 횟수를 입력받음
		
		System.out.println("원하는 hello 출력 횟수를 입력하세요.");
		int count = sc.nextInt();
		
		for(int c=0; c<count; c++) {
			System.out.println("hello");
			
		}
	}

}
