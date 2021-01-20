package template;

public class CarTest {

	public static void main(String[] args) {

		Car aiCar= new AiCar();
		aiCar.run();
		
		System.out.println();
		
		Car personCar= new PersonCar();
		personCar.run();
	}

}
