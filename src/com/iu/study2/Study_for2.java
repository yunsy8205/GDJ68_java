package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study_for2 {


	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		// 시계
		// 종료할 분, 초를 입력 받아서
		// 해당 분초가 되면 종료
		
		System.out.println("종료할 분을 입력하세요.");
		int m = sc.nextInt();
		System.out.println("종료할 초을 입력하세요.");
		int s = sc.nextInt();
		boolean check = false;
		
		for(int min=0;min<6;min++) {
			
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+"분"+sec+"초");
				if(min==m&&sec==s){
					check=true;
					break;
				}
			}
			if(check) {
				break;
			}
		}

		
		//		for(int dan=2; dan<10; dan++) {
//			for(int i=1;i<10;i++) {
//				System.out.println(dan+"*"+i+"="+dan*i);
//			}
//		}
//		for(int i=0;i<5;i++) {
//			int num = random.nextInt(3);//0~3 미만의 정수 한개를 랜덤
//			
//			switch(num) {
//			case 0:
//				System.out.println(num);
//				i=5;
//				break;
//			case 1:
//				System.out.println(num);
//			default:
//				System.out.println(num);
//			}
//		}
//		
//		System.out.println("프로그램 종료");
		
	}

}
