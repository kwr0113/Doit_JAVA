package day14;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console cs = System.console();
		
		System.out.println("�̸� :");
		String name = cs.readLine();
		System.out.println("���� :");
		String job = cs.readLine();
		System.out.println("��й�ȣ :");
		char[] pass = cs.readPassword();
		String strPass = new String(pass);

		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}
