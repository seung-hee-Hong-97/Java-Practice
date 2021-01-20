package thispart;

public class PersonTest {

	public static void main(String[] args) {

		Person noName= new Person();
		
		Person kim= new Person("±è¹ü¼ö", 42);
		
		noName.showInfo();
		kim.showInfo();
		
		System.out.println(kim);
		System.out.println(noName);
		
		Person k= kim.getSelf();
		System.out.println(k);
	}

}
