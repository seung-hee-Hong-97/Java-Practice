package abstractex;

public abstract class Computer {

	public abstract void typing();
	public abstract void display();
	
	public void turnOn() {
		System.out.println("컴퓨터 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("컴퓨터 전원을 끕니다.");
	}
}
