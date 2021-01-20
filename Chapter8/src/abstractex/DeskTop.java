package abstractex;

public class DeskTop extends Computer{

	@Override
	public void typing() {
		System.out.println("DeskTop Typing");
	}

	@Override
	public void display() {
		System.out.println("DeskTop Display");
	}

	public void turnOff() {
		System.out.println("DeskTop turnOff");
	}
	
}
