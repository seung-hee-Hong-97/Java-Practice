package cooperation;

public class Subway {

	public int subwayNumber;
	public int price;
	public int passenger;
	
	public Subway(int subwayNumber) {
		this.subwayNumber= subwayNumber;
	}
	
	public void take(int money) {
		passenger++;
		this.price += money;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber + "호선 지하철의 승객 수는 " + passenger + "명이고, 수입은 " + price + "원 입니다.");
	}
}
