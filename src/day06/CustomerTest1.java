package day06;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		//System.out.println(customerLee.ShowCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 10000;
		//System.out.println(customerKim.ShowCustomerInfo());
		
		int price = 10000;
		
		System.out.println(customerLee.getCustomerName() + "���� �����Ͻ� �ݾ��� "
				+ customerLee.calcPrice(price) + " �� �Դϴ�.");
		System.out.println(customerKim.getCustomerName() + "���� �����Ͻ� �ݾ��� "
				+ customerKim.calcPrice(price) + " �� �Դϴ�.");

	}

}
