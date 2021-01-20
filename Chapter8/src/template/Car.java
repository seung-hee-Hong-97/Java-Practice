package template;

public abstract class Car {

	public abstract void turnOn();
	public abstract void start();
	public abstract void stop();
	public abstract void turnOff();
	
	public void wash() {
		
	}
	
	final public void run() {
		turnOn();
		start();
		stop();
		turnOff();
		wash();
	}
}
