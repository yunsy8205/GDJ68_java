package com.iu.study4.s1;

public class S1Main {

	public static void main(String[] args) {
		//void : 리턴할 데이터가 없다는 의미
		//메서드에 리턴타입을 입력해주면 - 메서드에서 처리된 데이터를 리턴할 수 있다..
		Hap hap= new Hap();
		
		int sum = hap.h1(10, 20); // 리턴됨
		//*2
		System.out.println(sum*2);
		
		//h2 결과 출력
		boolean check = hap.h2(20);
		System.out.println(check);
		
		//h3 length 출력
		int [] ar = hap.h3(7);
		System.out.println(ar.length);
		
		
	}
}
