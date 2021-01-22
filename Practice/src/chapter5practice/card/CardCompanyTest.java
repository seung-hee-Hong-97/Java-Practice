package chapter5practice.card;

/* static과 singleton pattern 문제
 
 - 카드 회사가 있다. 
 - 카드회사는 유일한 객체이고, 이 회사에서는 카드를 발급하면 항상 고유번호가 자동으로 생성된다.
 - 10001부터 시작해서 카드가 생성될 때 마다 10002, 10003식으로 증가한다.
 - Card 클래스와 CardCompany 클래스를 구현하라
 */

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany company= CardCompany.getInstance();
		
		Card card1= company.getCard();
		Card card2= company.getCard();
		
		System.out.println(card1.getCardNumber());
		System.out.println(card2.getCardNumber());
		
	}

}
