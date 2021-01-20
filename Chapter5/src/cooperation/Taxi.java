package cooperation;

public class Taxi {

	public int taxiNumber;
	public int price;
	public int passenger;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber= taxiNumber;
	}
	
	public void take(int money) {
		passenger++;
		this.price += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNumber + "번 택시의 승객 수는 " + passenger + "명이고, 수입은 " + price + "원 입니다.");
	}
}
