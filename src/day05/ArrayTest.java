package day05;

public class ArrayTest {

	public static void main(String[] args) {
		
		int num1[] = new int[10];
		int[] num2 = new int[10];
		
		int[] num3 = new int[] {1,2,3,4,5,6,7,8,9,10}; // ���� ����
		// int[] num4 = new int[10] {1,2,3,4,5,6,7,8,9,10}; �� �־� �ʱ�ȭ �� []�ȿ� ���� ���� ���� �߻�
		int[] num5 = {1,2,3,4,5,6,7,8,9,10}; // ����� ���ÿ� �ʱ�ȭ �� ���� new int[]�κ� ���� ����
		
		int[] num6;								 // �ڷ����� ���� �����ϰ� �ʱ�ȭ �ϴ� ���
		num6 = new int[] {1,2,3,4,5,6,7,8,9,10}; // new int[]�� ������ �� ����
		
		for(int i = 0; i < num5.length; i++) {
			System.out.println(num5[i]);
		}

	}

}
