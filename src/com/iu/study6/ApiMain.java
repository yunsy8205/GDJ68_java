package com.iu.study6;

public class ApiMain {

	public static void main(String[] args) {
		//객체 생성
		Object obj = new Object();
		boolean check = obj.equals(null);
		String str = obj.toString();
		int r=obj.hashCode();
		String st = "hello"; // 평소 작성 코드
		st = new String("hello"); //원래는 이방법으로 작성해야함.  
		char ch=st.charAt(1);
		
		System.out.println(ch);

	}

}
