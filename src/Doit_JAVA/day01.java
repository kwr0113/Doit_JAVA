package Doit_JAVA;

public class day01 {

	public static void main(String[] args) {
		
		//
		// day01 : 01-1 ~ 02-3
		//
		
		// Hello, Java ���� ����ϱ�
		System.out.println("Hello, Java");
		
		System.out.println();
		
		// ���� �����Ͽ� ����ϱ�, ���� �ʱ�ȭ�ϱ�
		int level;
		level = 10;
		int level2 = 20;
		System.out.println(level);
		System.out.println(level2);
		
		System.out.println();
		
		// ������ ����
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		System.out.println();
		
		// �Ǽ��� ����
		double dnum = 3.14;
		float fnum = 3.14f;
		System.out.println(dnum);
		System.out.println(fnum);
		
		System.out.println();
		
		//�ε� �Ҽ��� ����� ����
		double dnum2 = 1;
		for(int i = 1; i < 10000; i++)
			dnum2 = dnum2 + 0.1;
		System.out.println(dnum2);
		
		System.out.println();
		
		//���� ����
		boolean isMarried = true;
		System.out.println(isMarried);
		
	}

}
