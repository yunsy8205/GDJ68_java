package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worrier worrier = new Worrier();
		worrier.getItem();
		Magician magician = new Magician();
		magician.getItem(); //메소드를 상속받음
		                    //상속은 다른 클래스를 만들 때 도움을 주기 위한 것이다.
		
		//worrier.axe.name : 전사가 가지고 있는 칼의 이름
		
		Character character = magician;// 자동형변환 : 다형성
		
		magician.setMp(20);
		magician = (Magician)character;
		magician.setMp(0);
		
		character = worrier;
		
		Character [] w = new Character[2];
		w[0]=worrier;
		w[1]=magician; // 다른 타입의 객체를 모으기 위해 형변환 필요!
		
		worrier = (Worrier)w[0]; // 강제형변환
		magician = (Magician)w[1];
		magician.setMp(20);
		
		//-------------------------------
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20); 
		// 처음에 캐릭터로 만들었기 때문에 hip영역에 MP가 생성되지 않아서 에러 발생
	}

}
