package chapter8practice.template;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		level= new Beginner();
		level.showInfo();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upGradeLevel(PlayerLevel level) {
		this.level = level;
		level.showInfo();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
