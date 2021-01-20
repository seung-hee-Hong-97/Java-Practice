package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Person p1= new Person("±èÃ¶¼ö", 5000);
		Person p2= new Person("Áö¼Û½º", 8000);
		Person p3= new Person("¸®Ä¡", 30000);
		
		Bus bus= new Bus(30);
		Subway subway= new Subway(2);
		Taxi taxi= new Taxi(3132);
		
		p1.takeBus(bus);
		p2.takeSubway(subway);
		p3.takeTaxi(taxi);
		
		bus.showBusInfo();
		subway.showSubwayInfo();
		taxi.showTaxiInfo();
	
		System.out.println();
		
		p1.showPersonInfo();
		p2.showPersonInfo();
		p3.showPersonInfo();
	}
}
