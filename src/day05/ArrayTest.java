package day05;

public class ArrayTest {

	public static void main(String[] args) {
		
		int num1[] = new int[10];
		int[] num2 = new int[10];
		
		int[] num3 = new int[] {1,2,3,4,5,6,7,8,9,10}; // 개수 생략
		// int[] num4 = new int[10] {1,2,3,4,5,6,7,8,9,10}; 값 넣어 초기화 시 []안에 개수 쓰면 오류 발생
		int[] num5 = {1,2,3,4,5,6,7,8,9,10}; // 선언과 동시에 초기화 할 때는 new int[]부분 생략 가능
		
		int[] num6;								 // 자료형을 먼저 선언하고 초기화 하는 경우
		num6 = new int[] {1,2,3,4,5,6,7,8,9,10}; // new int[]를 생략할 수 없음
		
		for(int i = 0; i < num5.length; i++) {
			System.out.println(num5[i]);
		}

	}

}
