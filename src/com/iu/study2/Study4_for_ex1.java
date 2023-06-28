package com.iu.study2;

public class Study4_for_ex1 {

	public static void main(String[] args) {
		// 0-10미만의 숫자 중 짝수 만 출력
		
		for(int i=0; i<10; i++) {
			
			if(i%2==0) {
			System.out.println(i);
			}	
		}
		
		System.out.println("-------------------");
		
		//0-10미만의 숫자 중 짝수 만 출력
		//단, if문 사용 X
		
		for(int i=0; i<10; i++) {
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("-------------------");

		for(int i=0; i<10; i=i+2) {
			
			System.out.println(i);
		}
		
		//a-z 출력
		System.out.println("-------------------");

		for(int j=97; j<=122; j++) {
			
			System.out.println((char)j);
		}
		System.out.println("-------------------");
		for(int j='a'; j<='z'; j++) {
			
			System.out.println((char)j);
		}
		
	}

}
