package Doit_JAVA;

public class day02 {

	public static void main(String[] args) {
		
		//
		// day02 : 02-4 ~ 04-2
		//
		
		// ��� ����ϱ�
		final int MAX_NUM = 100;
		final int MIN_NUM;
		MIN_NUM = 0;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		//MAX_NUM = 1000; ����� ���� ������ �� ���� ������ ���� �߻�
		
		System.out.println();
		
		// ������ �� ��ȯ
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
		
		// ������ �� ��ȯ 2
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		System.out.println();
		
		// ��� �����ڸ� ����Ͽ� ������ ��� ���ϱ�
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
		
		System.out.println();
		
		// ���� �����ڸ� ����Ͽ� �� �����ϱ�
		int gameScore = 150;
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		System.out.println();
		
		// �ܶ� ȸ�� �� �ǽ��ϱ�
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
		
		// ���� �����ڸ� ����Ͽ� �θ���� ���� ���ϱ�
		int fatherAge = 45;
		int motherAge = 37;
		char ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
		
		System.out.println();
		
		// ���̿� ���� �ٸ� ���� ����ϱ�
		int age = 7;
		if (age >= 8) {
			System.out.println("�б��� �ٴմϴ�.");
		} else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		
		System.out.println();
		
		// if-else if-else ������ ����� ����ϱ�
		int age1 = 9;
		int charge;
		if (age < 8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("��,����л��Դϴ�.");
		} else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�.");
		}
		System.out.println("������ " + charge + "�� �Դϴ�.");
		
		System.out.println();
		
		// ������ ���� ���� �ο��ϱ�
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
		System.out.println("������ " + score + "�� �Դϴ�.");
		System.out.println("������ " + grade + " �Դϴ�.");
		
		System.out.println();
		
		// switch-case �� ����
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
		System.out.println(ranking + "�� �޴��� ������ " + medalColor + " �Դϴ�.");
		
		System.out.println();
		
		// switch-case �� ����2
		String medal = "Gold";
		switch (medal) {
			case "Gold" :
				System.out.println("�ݸ޴��Դϴ�.");
				break;
			case "Silver" :
				System.out.println("���޴��Դϴ�.");
				break;
			case "Bronze" :
				System.out.println("���޴��Դϴ�.");
				break;
			default:
				System.out.println("�޴��� �����ϴ�.");
		}
		
		System.out.println();
		
		// switch-case �� ����
		int floor = 5;
		String store = null;
		switch (floor) {
			case 1 : 
				store = "�౹";
				break;
			case 2 : 
				store = "�����ܰ�";
				break;
			case 3 : 
				store = "�Ǻΰ�";
				break;
			case 4 : 
				store = "ġ��";
				break;
			case 5 : 
				store = "�ｺ Ŭ��";
				break;
			default: 
				System.out.println("�߻�");
		}
		System.out.println(floor + "�� " + store + " �Դϴ�.");
		
		System.out.println();
			
		// while�� ����Ͽ� 1���� 10���� ���ϱ�
		int numw = 1;
		int sumw = 0;
		while(numw <= 10) {
			sumw += numw;
			numw++;
		}
		System.out.println("1���� 10������ ���� " + sumw + "�Դϴ�.");
		
		System.out.println();
		
		// do-while ����
		int numd = 1;
		int sumd = 0;
		do {
			sumd += numd;
			numd++;
		} while (numd <= 10);
		System.out.println("1���� 10������ ���� " + sumd + "�Դϴ�.");
		
		System.out.println();
		
		// for�� ����
		int iff;
		int sumf;
		for (iff = 1, sumf = 0; iff <= 10; iff++) {
			sumf += iff;
		}
		System.out.println("1���� 10������ ���� " + sumf + "�Դϴ�.");
		
		System.out.println();
		
		// continue�� ����
		int total = 0;
		int numc;
		for (numc = 1; numc <= 100; numc++) {
			if (numc % 2 == 0)
				continue;
			total += numc;
		}
		System.out.println("1���� 100������ Ȧ���� ���� " + total + " �Դϴ�.");
		
		System.out.println();
		
		// break�� ����
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
