package cooperation;

public class Bus {

	public int busNumber;
	public int price;
	public int passenger;
	
	public Bus(int busNumber) {
		this.busNumber= busNumber;
	}
	
	public void take(int money) {
		passenger++;
		this.price += money;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객 수는 " + passenger + "명이고, 수입은 " + price + "원 입니다.");
	}
}
