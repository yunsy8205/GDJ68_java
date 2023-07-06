package com.iu.study4.s3;

public class Test {
	
	int num1;
	double num2;
	
	public void hap(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int n1, float n2) {
		System.out.println(n1+n2);
	}
	
	
	public void hap(int num1) {
		System.out.println(num1+this.num1);
		//멤버변수(힙)와 지역변수(스택)는 변수명이 같아도 중복이 아니다. 다른 영역에 저장되기 때문에
		//지역변수가 우선순위가 높아서 멤버변수와 지역변수가 같은 이름이면 지역변수로 인식
	}
	public boolean same(Test t) {
		//num1과 다른 객체의 num1이 같고
		//num2와 다른 객체의 num2가 같으면,
		//true리턴, 아니면 false리턴
		boolean result = false;
		if(this.num1==t.num1 && this.num2==t.num2) {
			result=true;
		}
		return result;
	}
	
	public void method1() {
		//참조변수명.멤버변수명 (this. 생략되어 있다.)
		System.out.println(num1+num2);
		System.out.println(this);
		this.method2();//this 생략가능하다.
		method2();
	}
	
	public void method2() {
		System.out.println("method2");
	}
}
