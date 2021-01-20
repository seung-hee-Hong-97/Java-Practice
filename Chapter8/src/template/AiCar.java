package template;

public class AiCar extends Car{

	@Override
	public void turnOn() {
		System.out.println("자동으로 시동을 켭니다.");
	}

	@Override
	public void start() {
		System.out.println("자율주행을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동으로 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("자동으로 시동을 끕니다.");
	}

}
