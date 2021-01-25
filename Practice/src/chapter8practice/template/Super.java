package chapter8practice.template;

public class Super extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("매우 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 회전합니다.");
	}

	@Override
	public void showInfo() {
		System.out.println("******** 고급자 레벨 ********");		
	}
}
