package com.iu.study3;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		int [] nums = new int[6];
		Random random = new Random();
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+1+"첫번째 번호 뽑기");
			nums[i]=random.nextInt(45)+1;// 0부터 시작하기 때문에 +1을 해준다.
			for(int j=0;j<i;j++) {
				System.out.println("nums["+i+"]와 "+"nums["+j+"]의 값을 비교했다.");
				if(nums[i]==nums[j]) {
					System.out.println("중복!");
					i--;
					/* 방법2
					nums[i]=random.nextInt(45)+1;
					j--;
					*/
				}
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<6;j++) {
				if(nums[i]>nums[j]) {
					int tmp=nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
