package chapter5practice.coffee;
/* 객체 간 협력 - 출근길 커피 사기
 - 김 졸려 씨는 4,000원을 내고 별다방에서 아메리카노를 사서 마셨다. (별다방 라떼 가격: 4300원)
 - 이 피곤 씨는 4,500원을 내고 콩다방에서 라떼를 사서 마셨다. (콩다방 아메리카노 가격: 4200원)
 객체 간의 협력을 사용하여, 객체 지향 방법으로 구현해라
 */


public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Person kim= new Person("Kim", 10000);
		Person lee= new Person("Lee", 8000);
		
		BeanCoffee beanCoffee= new BeanCoffee();
		StarCoffee starCoffee= new StarCoffee();
		
		kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		
	}
	
}
