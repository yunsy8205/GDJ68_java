package com.iu.study4.s5;

public class MyCar {
	public static String company="Kia";
	public String brand;
	
	//--클래스변수 초기화 방법--
	static{
		MyCar.company="AUDI";
	}
	
	//--멤버변수 초기화 방법--
	{}//객체 생성시
	public MyCar() {}//객체 생성시
	//setter : 객체 생성 후
}
