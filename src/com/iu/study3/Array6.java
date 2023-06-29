package com.iu.study3;

public class Array6 {

	public static void main(String[] args) {
		double [] ar = new double [3];
		ar[0]=1.2;
		ar[1]=3;//자동형 변환
		
		int [] nums1 = new int[3];
		int [] nums2 = new int[3];
		
		System.out.println(nums1==nums2);
		nums1 = nums2;
		System.out.println(nums1==nums2);
		
		//데이터타입 [] 변수명
		//int [][] ars = new int[2][2]; //{{1,2},{2,3}}
		
		//중첩 배열
		int [][]ars={{1,2},{3,4}};
		ars = new int[2][];// 가변배열
		ars[0] = new int[3]; // 사용전에 선언해주어야 한다.
		ars[1] = new int[6];
		//{{0,0,0},{0,0,0,0,0,0}};
		
		// 잘 쓰지는 않음
		
		for(int i=0;i<ars.length;i++) {
			for(int j=0;j<ars[i].length;j++) {
				System.out.println(ars[i][j]);
			}
		}

	}

}
