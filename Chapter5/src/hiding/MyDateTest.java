package hiding;

/* 다음 조건에 맞는 MyDate 클래스를 만들어라
 
 - day, month, year 변수는 private으로 선언
 - 각 변수의 getter, setter를 public으로 구현
 - MyDate(int year, int month, int day) 생성자를 생성
 - public boolean isValid() 메서드를 만들어 날짜가 유효한지 확인
 - MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한지 확인
 */

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1= new MyDate(2002, 6, 12);
		MyDate date2= new MyDate(2001, 2, 29);
		
		date1.isValid();
		date2.isValid();
	}

}
