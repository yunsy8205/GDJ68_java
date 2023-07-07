package com.iu.study4.s5;

public class S5Main {

	public static void main(String[] args) {
		// static : 객체를 만들지 않고 사용할 수 있다.
		//StaticTest st = new StaticTest();
		//클래스명.클래스변수명 (객체가 만들지 않고, 메서드 영역에서 이미 만들고 시작하기 때문에)
		//StaticTest.staticNum=20;
		//클래스명.메스드명();
		//StaticTest.staticMethod();
		MyCar.company="Kia";
		MyCar myCar = new MyCar();
		myCar.brand="A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar2.brand="SL8";
		
		System.out.println(MyCar.company);
		System.out.println(myCar2.brand);
	}

}
