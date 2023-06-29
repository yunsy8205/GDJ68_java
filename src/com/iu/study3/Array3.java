package com.iu.study3;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4};
//		System.out.println(nums.length);//길이 
		
		int [] copyNums = new int [nums.length+1];
		
		for(int i=0;i<nums.length;i++) {
			copyNums[i]=nums[i];
		}
				
		copyNums[nums.length]=5;
		
		nums=copyNums;//Heap 영역의 주소도 바꿔줌
		
//		System.out.println(nums.length);
		
		// copyNums를 재사용할 수 있다.
		
		copyNums = new int [nums.length-1];
		
		for(int i=0;i<nums.length-1;i++) {
			copyNums[i]=nums[i];
		}
		
		nums=copyNums;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
