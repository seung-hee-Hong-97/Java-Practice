package chapter8practice.template2;

public class Genesis extends Car{

	@Override
	public void start() {
		System.out.println("Genesis에 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Genesis를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("Genesis가 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis의 시동을 끕니다.");
	}
}
