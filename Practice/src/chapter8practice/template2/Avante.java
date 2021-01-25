package chapter8practice.template2;

public class Avante extends Car{

	@Override
	public void start() {
		System.out.println("Avante에 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Avante를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("Avante가 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Avante의 시동을 끕니다.");
	}

}
