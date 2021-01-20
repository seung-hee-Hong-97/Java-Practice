package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer lee= new Customer(10010, "이순신");
		lee.bonusPoint= 1000;
		
		Customer kim= new VIPCustomer(10020, "김유신");
		kim.bonusPoint= 10000;
		
		int priceLee= lee.calcPrice(10000);
		int priceKim= kim.calcPrice(10000);
		
		System.out.println(lee.showCustomerInfo() + "지불 금액은 " + priceLee + "원 입니다.");
		System.out.println(kim.showCustomerInfo() + "지불 금액은 " + priceKim + "원 입니다.");
	}

}
