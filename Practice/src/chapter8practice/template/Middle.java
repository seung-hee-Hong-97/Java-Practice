package chapter8practice.template;

public class Middle extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump를 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 할 줄 모릅니다.");
	}

	@Override
	public void showInfo() {
		System.out.println("******** 중급자 레벨 ********");		
	}
}
