package com.iu.study5.s2;

public class Customer {
	
	private int money;
	private int point;
	
	public Customer() {
		this.money = 10000000;
		this.point=50;
	}//setter Getter 안하고 생성자에 초기화
	
	public void buy(Electronics [] electronics) {
		
		for(int i=0;i<electronics.length;i++) {//2개 구매
			this.money = this.money-electronics[i].getPrice();
			this.point = this.point+electronics[i].getPoint();
		}
		System.out.println("잔액 : "+this.money);
		System.out.println("포인트 : "+this.point);
	}
}
