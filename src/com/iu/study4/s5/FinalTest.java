package com.iu.study4.s5;

public final class FinalTest { // 상속불가
	
	public static final int SIZE=50;
	
	public final int MAX_NUM; // 변수지만 상수로 사용 : 한번 입력한 값은 변경이 불가

	public FinalTest() {
		this.MAX_NUM=20;// 상수는 대문자로 표현
	}
	public final void finalMethod() {  //오버라이딩 불가
		final int a=10; // 변수지만 상수로 사용 : 한번 입력한 값은 변경이 불가
	}
}
