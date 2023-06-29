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
				check=!check;
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
		//14->15:42ㄴ
		//랩업시 게임을 계속할지 종료할지 선택합니다.
		
		//현재레벨, GOLD 출력 (최종레벨이 되면)
		
		if(check) {
			int level=1;
			int gold=0;
			
			for(level=1;level<15;level++) {
				
				if(level==5) {
					gold = gold + 1000;
				}
				if(level==10) {
					gold = gold + 2000;
				}
				
				//랩업시 게임을 계속할지 종료할 지 선택
				System.out.println("1.사냥시작 2.게임종료");
				int select=sc.nextInt();
				if(select !=1) {
					break;
				}
				for(int monster=0;monster<level*3;monster++) {// 변수를 쓰는대신 level*3으로 하면 변수사용을 줄일 수 있다.
					System.out.println(monster+1+" 마리 사냥 서공");
				}
				System.out.println(level+1+"로 랩업 했습니다.");
			}//레벨업 과정
			
			if(level==15) {
				gold=gold+3000;
			}
			// 현재레벨, GOLD 출력
			System.out.println("현재 레벨 : "+level);
			System.out.println("현재 골드 : "+gold);
		
			System.out.println("프로그램 종료");
		}
	}
}
