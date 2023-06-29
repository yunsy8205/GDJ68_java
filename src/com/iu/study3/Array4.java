package com.iu.study3;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4,5};
		
		System.out.println("지우려고하는 idx번호를 입력하세요");
		int idx = sc.nextInt();
		
		int [] copyNums = new int[nums.length-1];
		
		for(int i=0;i<nums.length;i++) {
			if(i==idx) {
				continue;
			}else if(i<idx){
				copyNums[i]=nums[i];
			}else {
				copyNums[i-1]=nums[i];
			}
		}
		
		nums=copyNums;
		System.out.println(nums.length);
		System.out.println("-------------------");
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}

	}

}
