package com.iu.study5.s1;

public class Magician extends Character{

	private int mp;
	
	public Magician() {
		super(); //부모의 생성자 호출 (입력 안해도 생략되어 있다.)
			     //부모 객체에 자신의 객체를 덧붙임
				 //둘다 생성자의 첫줄에 위치해야 해서 this()와 super()를 같이 쓸 수 없다.
	}

	
	public int getMp() {
		return mp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	//overriding : 수정
	//상속받은 메서드의 내용을 자기에 맞게 재정의
	//상속받은 메서드의 선언부는 동일
	@Override
	public void hit() {
		
		System.out.println("파이어볼");
	}


}
