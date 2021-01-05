package day06;

import java.util.ArrayList;

public class CustomerTest3 {

	public static void main(String[] args) {
	
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10030, "ȫ�浿");
		Customer customerYoul = new GoldCustomer(10040, "������");
		Customer customerKim = new VIPCustomer(10050, "������", 12345);

		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("===== ���� ���� ��� =====");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== ���η��� ���ʽ� ����Ʈ ��� =====");
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " ���� " + cost + " �� �����߽��ϴ�.");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� "
								+ customer.bonusPoint + " �� �Դϴ�.");
		}
		
	}

}



