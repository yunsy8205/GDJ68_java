package com.iu.study2;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check= false;
		
		// 로그인 시도 최대 5번까지
		
		for(int i=0; i<5; i++) {
			System.out.println("아이디를 입력하세요.");
			int id_input=sc.nextInt();
			System.out.println("비밀번호를 입력하세요.");
			int pw_input=sc.nextInt();
			
			if(id_input==id && pw_input==pw) {
				System.out.println("로그인 성공");
				i=5;
			    check= true;
			}else {
				System.out.println("ID 또는 PW가 틀렸습니다.");
			}
		
		}
		
		//로그인 성공시 급여계산 문구 출력
		if(check){
			System.out.println("급여 계산");
		}
		
		System.out.println("프로그램 종료");
	}

}
