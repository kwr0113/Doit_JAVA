package Doit_JAVA;

public class day01 {

	public static void main(String[] args) {
		
		//
		// day01 : 01-1 ~ 02-3
		//
		
		// Hello, Java 문장 출력하기
		System.out.println("Hello, Java");
		
		System.out.println();
		
		// 변수 선언하여 사용하기, 변수 초기화하기
		int level;
		level = 10;
		int level2 = 20;
		System.out.println(level);
		System.out.println(level2);
		
		System.out.println();
		
		// 문자형 연습
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		System.out.println();
		
		// 실수형 연습
		double dnum = 3.14;
		float fnum = 3.14f;
		System.out.println(dnum);
		System.out.println(fnum);
		
		System.out.println();
		
		//부동 소수점 방식의 오류
		double dnum2 = 1;
		for(int i = 1; i < 10000; i++)
			dnum2 = dnum2 + 0.1;
		System.out.println(dnum2);
		
		System.out.println();
		
		//논리형 연습
		boolean isMarried = true;
		System.out.println(isMarried);
		
	}

}
