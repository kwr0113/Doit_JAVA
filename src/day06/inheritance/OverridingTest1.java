package day06.inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {

		Customer vc = new VIPCustomer(10030, "������", 54321);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "���� �����Ͻ� �ݾ��� "
				+ vc.calcPrice(10000) + " �� �Դϴ�.");

	}

}
