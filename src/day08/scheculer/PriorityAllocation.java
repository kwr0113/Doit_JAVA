package day08.scheculer;

public class PriorityAllocation implements Schedular {

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� Skill ���� ���� �������� �켱������ ����մϴ�.");
	}
	
}
