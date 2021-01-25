package chapter7practice;

public class GoldCustomer extends Customer{

	public double salesRatio;
	
	public GoldCustomer(String name) {
		this.customerName= name;
		
		customerGrade= "GOLD";
		salesRatio= 0.1;
		bonusRatio= 0.02;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		return price - (int) (price * salesRatio);
	}
}
