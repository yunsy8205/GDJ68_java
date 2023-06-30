package com.iu.study4;

public class Rifle {
	
	boolean mod; //true,단발, false,점사
	//메서드가 하는 일을 나타냄
	//메서드 선언 공식
	//[]는 옵션으로 선택할 수 있는 사항을 의미한다.
	//접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수들 선언]){실행코드}
	//public static void main(String [] args){} <- 메인메서드
	//매개변수 : 연결해주는 변수
	public void shoot1(int count) {
		int damage=20; //지역변수, 메소드가 종료되면 같이 삭제됨
		for(int i=0;i<count;i++) {
			System.out.println("탕");
		}
		count=10;
	}
	
	//shoot2
	public void shoot2(int c, String n, int [] ar) {
		System.out.println("타타탕");//호출시 매개변수를 순서대로 입력
	}
}
