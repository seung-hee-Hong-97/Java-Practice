package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer= new DeskTop();
		computer.display();
		computer.typing();
		computer.turnOff();
		computer.turnOn();
		
		System.out.println();
		
		NoteBook myNote= new MyNoteBook();
		myNote.display();
		myNote.typing();
		myNote.turnOff();
		myNote.turnOn();
	}

}
