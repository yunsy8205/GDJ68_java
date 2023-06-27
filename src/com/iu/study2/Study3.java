package com.iu.study2;

public class Study3 {

	public static void main(String[] args) {
		// if, if-else, if -else if-else
		// switch() case
		int num=5;
		
		switch(num*2) {
		case 10:
			System.out.println("num = 10");
		         //10과 같으면 아래 내용을 실행한다.
		case 20:
			System.out.println("num = 20");
			
		default: // 그외 나머지
			System.out.println("num 모름");
		}
	
	}

}
