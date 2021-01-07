package day06.inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {

		Customer vc = new VIPCustomer(10030, "나몰라", 54321);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불하실 금액은 "
				+ vc.calcPrice(10000) + " 원 입니다.");

	}

}
