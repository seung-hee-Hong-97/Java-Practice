package template;

public class PersonCar extends Car{

	@Override
	public void turnOn() {
		System.out.println("사람이 시동을 켭니다.");
	}

	@Override
	public void start() {
		System.out.println("사람이 직접 운전을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("사람이 시동을 끕니다.");
	}
	
	public void wash() {
		System.out.println("사람이 직접 세차를 합니다.");
	}

	
}
