package com.iu.study2;

import java.util.Scanner;

public class Study_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 회원가입시 입력한 Data
		int id=1234;
		int pw=5678;
		boolean s=false;
		
		System.out.println("ID : ");
		int id_input=sc.nextInt();
		System.out.println("PW : ");
		int pw_input=sc.nextInt();
		
		//로그인 과정
		//ID와 PW를 입력받아서 로그인 처리
		//로그인 성공, 로그인 실패
		
		if(id_input==id) {
			if(pw_input==pw) {
				s=true;
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
		}else {
			System.out.println("로그인 실패");
		}
		
		//---로그인 처리 후 작성
		//로그인이 성공한 사람만 실행이 가능
		// 1.정규직, 2.계약직
		//급여 입력
		//정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
		//계약직 : 원천징수 3.3%
		//실급여 출력
		int pay_input = 0;
		int pay = 0;
		
		if(s) {			
			
		System.out.println("정규직은 1번/비정규직은 2번 입력");
		
	    int position =sc.nextInt();
		switch(position) {
		case 1:
			System.out.println("급여를 입력해주세요");
			pay_input = sc.nextInt();
			pay = (int)(pay_input*0.93);
			break;
		
		default : 
			System.out.println("급여를 입력해주세요");
			pay_input = sc.nextInt();
			pay = (int)(pay_input*0.967);
		}
		
	
		System.out.println(pay);
		}
 	}

}
