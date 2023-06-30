package com.iu.study4;

public class Soldier {
	
	String grade;
	int num;
	Rifle rifle; //멤버변수의 데이터타입은 제한이 없다. //rifle을 가지고 있다.
	int [] ar;
	
	public void attack(int c) {
		Rifle rifle = new Rifle();
		rifle.shoot1(c);
	}
	

}
