package day06.inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.getCustomerName() + "���� �����Ͻ� �ݾ��� "
				+ customerLee.calcPrice(price) + " �� �Դϴ�.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.getCustomerName() + "���� �����Ͻ� �ݾ��� "
				+ customerKim.calcPrice(price) + " �� �Դϴ�.");
		
		Customer vc = new VIPCustomer(10030, "������", 54321);
		vc.bonusPoint = 1000;
		System.out.println(vc.getCustomerName() + "���� �����Ͻ� �ݾ��� "
				+ vc.calcPrice(10000) + " �� �Դϴ�.");
	
		
		
	

	}

}
