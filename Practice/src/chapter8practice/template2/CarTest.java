package chapter8practice.template2;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {

		ArrayList<Car> list= new ArrayList<Car>();
		
		list.add(new Sonata());
		list.add(new Genesis());
		list.add(new Avante());
		list.add(new Grandeur());
		
		for(Car c: list) {
			c.run();
			System.out.println("******************************");
		}
		
	
	}

}
