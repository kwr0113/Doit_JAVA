package day08.scheculer;

import java.io.IOException;

public class SchedularTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");
		
		int ch = System.in.read();
		Schedular schedular = null;
		
		if(ch == 'R' || ch == 'r') {
			schedular = new RoundRobin();
		} else if(ch == 'L' || ch == 'l') {
			schedular = new LeastJob();
		} else if(ch == 'P' || ch == 'p') {
			schedular = new PriorityAllocation();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		schedular.getNextCall();
		schedular.sendCallToAgent();

	}

}
