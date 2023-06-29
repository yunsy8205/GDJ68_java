package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		//TRPG
		int hp=40;//유저의 HP
		int monsterHp=60;//몬스터의 HP
		int monsterPower=40;//몬스터의 공격력
		int userSelect=0;
		int userAttack=0;
		int rec=0;
		int run=0;
		boolean runSuccess=false;
		int monsterAttack=0;
		int skillCount=3;

		//1.평타 2.스킬 3.HP회복 4.도망
		//평타 : 0~10 미만의 공격이 몬스터에게 적용
		//스킬 : 0~30 미만의 공격이 몬스터에게 적용 (최대 3번까지만 가능)
		//회복 : 회복량 0~40 까지 (40넘어갈 수 없음)
		//도망 : 50% 확률로 성공, 실패

		//둘 중하나가 죽거나 도망에 성공해야 끝남

		//몬스터
		//무조건공격 : 유저 공격 0-40까지의 공격을유저에게

		System.out.println("game start!");

		while(true) {
			System.out.println("유저HP : "+hp);
			System.out.println("몬스터HP :"+monsterHp);
			System.out.println("1.평타 2.스킬 3.HP회복 4.도망");
			userSelect=sc.nextInt();
			
			//유저 선택 실행
			switch(userSelect) {
			case 1: 
				userAttack=random.nextInt(11);
				System.out.println("평타");
				monsterHp=monsterHp-userAttack;
				System.out.println("user가 공격력 "+userAttack+"으로 공격");
				if(monsterHp<=0) {
					System.out.println("몬스터 사냥 성공");
					runSuccess=true;
					break;
					}
				break;
			case 2:
				if(skillCount>0) {
					userAttack=random.nextInt(31);
					System.out.println("스킬");
					monsterHp=monsterHp-userAttack;
					System.out.println("user가 공격력"+userAttack+"으로 공격");
					skillCount--;
					if(monsterHp<=0) {
						System.out.println("몬스터 사냥 성공");
						runSuccess=true;
						break;
						}
					break;
				}else {
					System.out.println("마나가 부족합니다.");
				}
			case 3:
				rec=random.nextInt(40);
				System.out.println("user HP "+rec+" 회복");
				hp=hp+rec;
				if(hp>=41) {
					hp=40;
				}
			break;
			default:
				System.out.println("도망");
				run=random.nextInt(2);
				if(run==0) {
					System.out.println("도망성공");
					runSuccess=true;
				}else {
					System.out.println("도망실패");
				}
				}
	
			if(runSuccess) {
			break;
			}
			
			//몬스터 공격
			monsterAttack=random.nextInt(41);
			hp=hp-monsterAttack;
			System.out.println("몬스터가 공격력 "+monsterAttack+"으로 공격");
	
	
			if(hp<=0) {
			System.out.println("캐릭터 사망");
			break;
			}
		}//while문 종료

		System.out.println("Game end");
	}
}