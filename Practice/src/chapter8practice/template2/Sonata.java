package chapter8practice.template2;

public class Sonata extends Car{

	@Override
	public void start() {
		System.out.println("Sonata에 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Sonata를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("Sonata가 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata의 시동을 끕니다.");
	}
}
