package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Buy buy= new Customer();
		buy.buy();
		buy.order();
		
		System.out.println();
		
		Sell sell= new Customer();
		sell.sell();
		sell.order();
		
		System.out.println();
		
		Customer customer= new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		
	}

}
