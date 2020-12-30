package Doit_JAVA;

public class day02 {

	public static void main(String[] args) {
		
		//
		// day02 : 02-4 ~ 04-2
		//
		
		// 상수 사용하기
		final int MAX_NUM = 100;
		final int MIN_NUM;
		MIN_NUM = 0;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		//MAX_NUM = 1000; 상수는 값을 변경할 수 없기 때문에 오류 발생
		
		System.out.println();
		
		// 묵시적 형 변환
		byte bNum = 10;
		int iNum = bNum;
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
		System.out.println();
		
		// 묵시적 형 변환 2
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		System.out.println();
		
		// 산술 연산자를 사용하여 총점과 평균 구하기
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
		
		System.out.println();
		
		// 증감 연산자를 사용하여 값 연산하기
		int gameScore = 150;
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		System.out.println();
		
		// 단락 회로 평가 실습하기
		int num1 = 10;
		int i = 2;
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println();
		
		// 조건 연산자를 사용하여 부모님의 나이 비교하기
		int fatherAge = 45;
		int motherAge = 37;
		char ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
		
		System.out.println();
		
		// 나이에 따라 다른 문장 출력하기
		int age = 7;
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		System.out.println();
		
		// if-else if-else 문으로 입장료 계산하기
		int age1 = 9;
		int charge;
		if (age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
		
		System.out.println();
		
		// 성적에 따라 학점 부여하기
		int score = 90;
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("점수는 " + score + "점 입니다.");
		System.out.println("학점은 " + grade + " 입니다.");
		
		System.out.println();
		
		// switch-case 문 예제
		int ranking = 1;
		char medalColor;
		switch (ranking) {
			case 1 : medalColor = 'G';
				break;
			case 2 : medalColor = 'S';
				break;
			case 3 : medalColor = 'B';
				break;
			default: medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
		
		System.out.println();
		
		// switch-case 문 예제2
		String medal = "Gold";
		switch (medal) {
			case "Gold" :
				System.out.println("금메달입니다.");
				break;
			case "Silver" :
				System.out.println("은메달입니다.");
				break;
			case "Bronze" :
				System.out.println("동메달입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
		}
		
		System.out.println();
		
		// switch-case 문 연습
		int floor = 5;
		String store = null;
		switch (floor) {
			case 1 : 
				store = "약국";
				break;
			case 2 : 
				store = "정형외과";
				break;
			case 3 : 
				store = "피부과";
				break;
			case 4 : 
				store = "치과";
				break;
			case 5 : 
				store = "헬스 클럽";
				break;
			default: 
				System.out.println("삐삐");
		}
		System.out.println(floor + "층 " + store + " 입니다.");
		
		System.out.println();
			
		// while문 사용하여 1부터 10까지 더하기
		int numw = 1;
		int sumw = 0;
		while(numw <= 10) {
			sumw += numw;
			numw++;
		}
		System.out.println("1부터 10까지의 합은 " + sumw + "입니다.");
		
		System.out.println();
		
		// do-while 문제
		int numd = 1;
		int sumd = 0;
		do {
			sumd += numd;
			numd++;
		} while (numd <= 10);
		System.out.println("1부터 10까지의 합은 " + sumd + "입니다.");
		
		System.out.println();
		
		// for문 예제
		int iff;
		int sumf;
		for (iff = 1, sumf = 0; iff <= 10; iff++) {
			sumf += iff;
		}
		System.out.println("1부터 10까지의 합은 " + sumf + "입니다.");
		
		System.out.println();
		
		// continue문 예제
		int total = 0;
		int numc;
		for (numc = 1; numc <= 100; numc++) {
			if (numc % 2 == 0)
				continue;
			total += numc;
		}
		System.out.println("1부터 100까지의 홀수의 합은 " + total + " 입니다.");
		
		System.out.println();
		
		// break문 예제
		int sumb = 0;
		int numb = 0;
		for (numb = 0; ; numb++) {
			sumb += numb;
			if (sumb >= 100)
				break;
		}
		System.out.println("num : " + numb);
		System.out.println("sum : " + sumb);
		
	}

}
