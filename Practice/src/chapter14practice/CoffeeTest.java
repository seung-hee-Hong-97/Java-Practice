package chapter14practice;

/*데코레이터 패턴을 활용해 커피를 만들어 봐라

아메리카노
라떼= 아메리카노 + 우유
모카커피 = 아메리카노 + 우유 + 모카시럽
휘핑크림 모카커피= 아메리카노 + 우유 + 모카시럽 + 휘핑 크림
*/

public class CoffeeTest {

	public static void main(String[] args) {
		
		Americano americano= new Americano();
		americano.brewing();
		
		System.out.println("\n");
		System.out.println("<Latte>");
		Latte latte= new Latte(americano);
		latte.brewing();
		
		System.out.println("\n");
		System.out.println("<Mocha Coffee>");
		Mocha mocha= new Mocha(new Latte(new Americano()));
		mocha.brewing();
		
		System.out.println("\n");
		System.out.println("<Whipping Cream Mocha Coffee>");
		WhippingCream whipping= new WhippingCream(new Mocha(new Latte(new Americano())));
		whipping.brewing();
		
		
	}

}
