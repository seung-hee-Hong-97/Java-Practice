package cooperation;

public class Person {

	public String name;
	public int money;
	
	public Person(String name, int money) {
		this.name= name;
		this.money= money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1500);
		this.money -= 1500;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1300);
		this.money -= 1300;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showPersonInfo() {
		System.out.println(name + "님은 " + money + "원 남았습니다.");
	}
	
	
}
