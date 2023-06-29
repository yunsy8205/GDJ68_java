package com.iu.study3;

public class Array1 {

	public static void main(String[] args) {
		//배열(array)
		int num=1;
		int num2=2;
		double d=3.12;
		
		//데이터타입 변수명이 변수 선언
		//모을려고 하는 데이터타입 [] 변수명 = new 모을려고하는 데이터타입[갯수];
		int [] nums = new int [2];// []까지가 데이터타입이다. (int [])
		double [] avgs = new double [3];
		boolean [] checks = new boolean [3];
		System.out.println(num);
		System.out.println(nums);
		//배열 사용: 배열의변수명[인덱스번호], index번호는 정수타입(int)
		System.out.println(nums[0]);//힙에 만들어지는 값은 기본값으로 초기화 해줌
		System.out.println(avgs[0]);
		System.out.println(checks[0]);
		
		
		// 4byte 2개를 붙여서 만들어 달라는 의미
		
		//문자열 3개를 모을 배열 선언
		String [] names = new String [3];
		System.out.println(names);
		System.out.println(names[0]);// null 알수없는값
		
		int [] nums2 = {1,2,3};//{}로 쓰는 경우 : 값을 미리 넣기 위해서
		
		int nums3 [] = new int [3];//[]를 뒤에 넣는 경우에도 선언이 가능 (앞만보고 헷갈릴수 있음)
		nums = nums2; //nums2를 집어 넣음 : 주소를 넣겠다.
	}

}
