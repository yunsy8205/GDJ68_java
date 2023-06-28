package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check = true; // while문을 계속 돌리기위한 용도
		int ifcheck = 2;
		//while
		//1. 로그인 시도 2. 프로그램 종료
		while(check) {
			System.out.println("1.로그인 시도 2.프로그램 종료");
			int select=sc.nextInt();
			
			if(select==1) {
				System.out.println("ID 입력");
				int uid=sc.nextInt();
				System.out.println("PW 입력");
				int upw=sc.nextInt();
				
				if(uid==id&&upw==pw) {
					System.out.println("로그인 성공");
					ifcheck=1;
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else if(select==2) {
				break;
			}else {
				System.out.println("잘 못 누르셨습니다.");
			}

		}//while 끝
		
		//로그인 성공 했을 때만 진행
		//MMORPG
		//시작레벨:1
		//모든 몬스터의 경험치는 동일
		//최대레벨:15
		//GOLD:0(처음)
		//5레벨 달성시:1000GOLD 지급
		//10레벨 달성시:2000GOLD 지급
		//15레벨 달성시:3000GOLD 지급
		//1->2:3 (사냥성공)
		//2->3:6
		//3->4:9
		//4->5:12
		//...
		//14->15:42
		//랩업시 게임을 계속할지 종료할지 선택합니다.
		
		//현재레벨, GOLD 출력 (최종레벨이 되면)
		int b = 3;
		int i=1;
		int g=0;
		int success=0;
		int c=0;
		
		if(ifcheck==1) {
			int select=0;
			for(i=1;i<15;i++) {

				for(int j=0; j<b;j++) {
					System.out.println("사냥성공");
				}
				b=b+3;
				
				System.out.println(i+1+"레벨이 되셨습니다. 축하드립니다.");
				
				if(i==4) {
					System.out.println("1000GOLD 지급");
					g=g+1000;
				}else if(i==9) {
					System.out.println("2000GOLD 지급");
					g=g+2000;
				}else if(i==14) {
					System.out.println("3000GOLD 지급");
					g=g+3000;
				}
				
				success=i==14?1:0;
				
				if(i==14) {
					break;
				}
				
				while(true) {
					System.out.println("1.계속  2.종료");
					select=sc.nextInt();
					System.out.println(select);
					if(select==1) {
						break;
					}else if(select==2) {
						c=1;
						break;
					}else {
						System.out.println("잘 못 입력하셨습니다.");
					}
				}
				
				if(c==1) {
					break;
				}

			}
			if(success==1) {
				
				System.out.println("현재레벨 : "+(i+1)+", GOLD : "+g);
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
