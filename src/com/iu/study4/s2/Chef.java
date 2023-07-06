package com.iu.study4.s2;

public class Chef {
	
	String name;
	
	public void makeRamyun2(Ramyun [] ramyuns) {
		//라면 배열의 크기만큼 만들어주면됨 
		
		for(int i=0;i<ramyuns.length;i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title="진라면";
			ramyun.price=3000;
			
			ramyuns[i]=ramyun;
			
		}
	}
	
	public Ramyun [] makeRamyun(int count) {
		
		//Ramyun ramyun = new Ramyun();
		//Ramyun ramyun2= new Ramyun();
		
		//ramyun2 = ramyun;
		//ramyun2 = new Ramyun();
		//int num=2; 객체에 새로운 객체를 넣는 것이
		//num=3; 변수에 새로운 값을 넣는 것과 같은 의미
		
		//count 수만큼 담을 수 있는 배열
		Ramyun [] ramyuns = new Ramyun[count];
		for(int i=0;i<count;i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title="진라면";
			ramyun.price=3000;
			
			ramyuns[i]=ramyun; //배열에는 주소를 담는다.
		}
		
		
		return ramyuns;
		
	}
	
	public void makeKimbap() {
		
	}

}
