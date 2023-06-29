package com.iu.study3;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0;
		
		System.out.println("배열의 갯수를 입력하세요");
		c=sc.nextInt();
		
		int [] nums = new int[c];
		for(int i=0;i<c;i++) {//index의 약자가 i라서 i를 많이 씀
			System.out.println(i+1+" 번째 숫자 입력");
			nums[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<c;i++) {
			System.out.println(nums[i]);
		}
	}

}
