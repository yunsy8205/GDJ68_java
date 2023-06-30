package com.iu.study4.s1;

public class Hap {
	
	public int h1(int num1, int num2) {
		//메서드 생성시 리턴타입에 되돌려 주고 싶은 데이터타입(int)을 써주면 된다. 
		int sum = num1+num2;
		System.out.println(sum);
		return sum;
	}
	
	public boolean h2(int num) {
		//홀수면 true, 짝수면 false
		if(num%2==1) {
			return true;
		}else {
			return false;} // return은 하나만 할 수 있다.		
	}
		
	public int [] h3(int count) {
		//count 수만큼 정수를 담을 배열을 만들어서 리턴
//		int [] a = new int[count];
//		for(int i=0;i<count;i++) {
//			a[i]=i+1;
		return new int[count];
		}
}


