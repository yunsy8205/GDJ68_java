package com.iu.study5.s2;

public class S2Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModelName("갤럭시북");
		computer.setCpu("i9");
		computer.setColor("WHITE");
		computer.setPrice(2000000);
		computer.setPoint(20);
		
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModelName("좋은TV");
		tv.setInch(100);
		tv.setColor("Black");
		tv.setPrice(5000000);
		tv.setPoint(50);
		
		Phone phone = new Phone();
		phone.setCompany("APPLE");
		phone.setModelName("IPHONE15");
		phone.setOs("IOS");
		phone.setColor("PINK");
		phone.setPrice(1800000);
		phone.setPoint(15);
			
		Electronics [] electronics = new Electronics[2];
		
		electronics[0]=phone;
		electronics[1]=computer;
		
		Customer winter = new Customer();
		winter.buy(electronics);
		
	}

}
