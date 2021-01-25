package chapter10practice;

/* 날짜를 구현한 클래스 MyDate가 있다.
 
 날짜가 같으면 equals()메서드의 결과가 true가 되도록 구현하고
 HashCode도 같아지도록 hashCode()메서드를 구현해라
 */


public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1= new MyDate(2020, 12, 11);
		MyDate date2= new MyDate(2020, 12, 11);
		
		System.out.println(date1 == date2);
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(date1.hashCode() == date2.hashCode());
		
	}

}
