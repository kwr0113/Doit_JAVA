package day05;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] data = new double[5];
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		for(int i =0; i < size; i++) {
			System.out.println(data[i]);
		}
		
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + " , " + (int)alphabets[i]);
		}

	}

}
