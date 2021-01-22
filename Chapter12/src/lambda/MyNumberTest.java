package lambda;

public class MyNumberTest {

	public static void main(String[] args) {

		MyMaxNumber max= (x, y) -> (x>y) ? x : y;
		
		System.out.println(max.maxNumber(30, 10));
		
	}

}
