package day08.scheculer;

public class RoundRobin implements Schedular {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ��ġ�մϴ�.");
	}

}
