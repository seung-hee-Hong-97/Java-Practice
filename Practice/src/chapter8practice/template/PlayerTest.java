package chapter8practice.template;

public class PlayerTest {

	public static void main(String[] args) {

		Player player= new Player();
		player.play(1);
		
		PlayerLevel middle= new Middle();
		player.upGradeLevel(middle);
		player.play(2);
		
		PlayerLevel high= new Super();
		player.upGradeLevel(high);
		player.play(3);
		
		
		
	}

}
