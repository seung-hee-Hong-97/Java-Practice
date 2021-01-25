package chapter8practice.template;

public class Beginner extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 할 줄 모릅니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 할 줄 모릅니다.");
	}

	@Override
	public void showInfo() {
		System.out.println("******** 초급자 레벨 ********");
	}

}
