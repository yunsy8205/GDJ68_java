package com.iu.study2;

public class Study3_ex1 {
	
	public static void main(String[] args) {
		// 국어, 영어, 수학 입력
		// 총점 평균 계산 (평균은 int)
		// 90:A, 80:B, 70:C, 60:D
		// switch 사용
		int kor=80;
		int eng=60;
		int math=90;
		
		double total = kor+eng+math;
		int avg = (int)(total/3);
		int result = 0;
		
		result = avg/10;
		
		switch(result) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;	
		default: // 그외 나머지
			System.out.println("F");
		}

	}
}