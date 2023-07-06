package com.iu.study4.s3;

public class Car {
	
	// 멤버 변수 선언
	String company;// 생략시 접근지정자 default (같은 패키지 내에서만)
	String brand;
	String color;
	int price;
	
	// 생성자(Constructor) 선언
	// 접근지정자 클래스명과동일한이름(매개변수 선언){}
	public Car() {
		//기본 생성자 : 매개변수가 없는 생성자 (생성자를 선언 안해도 컴파일러가 만들어줌)
		this("A7"); // this() : 생성자 내에서 또다른 생성자를 호출 할 때 사용
//		this.company="AUDI";
//		this.brand="A7";
//		this.color="PINK";
//		this.price = 9985;
	}
	
	public Car(String brand){
		this(brand, "PINK");
//		System.out.println("자동차를 만듭니다");
//		this.company="AUDI";
//		this.brand=brand;//this를 생략하면 안된다.
//		this.color="PINK";
//		this.price = 9985;
	}
	
	public Car(String brand, String color){
		this(brand, color, 9985);
//		System.out.println("자동차를 만듭니다");
//		this.company="AUDI";
//		this.brand=brand;//this를 생략하면 안된다.
//		this.color=color;
//		this.price = 9985;
	}
	
	public Car(String brand, String color, int price){
		System.out.println("자동차를 만듭니다");
		this.company="AUDI";
		this.brand=brand;//this를 생략하면 안된다.
		this.color=color;
		this.price=price;
	}
	
	// 멤버 메서드 선언
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Wheel : "+this.price);
	}
	
}
