package com.iu.study4.s2;

public class Student {
	private String name;
	private int num;// 학생번호
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	// 멤버변수는 거의 프라이빗 , 메서드는 거의 퍼블릭으로 사용한다.
	//set,get 메서드

	
	//메서드명 cal
	//해당 인스턴스의 total, avg를 계산해서 대입
	
	public void cal() {		
		total =kor+eng+math;
		avg = total/3.0;

	}

	//set,get 메서드
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}

}
