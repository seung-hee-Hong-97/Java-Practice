package chapter5practice.card;

public class CardCompany {
	
	private static CardCompany instance= new CardCompany();
	private CardCompany() {
		
	}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance= new CardCompany();
		}
		return instance;
	}
	
	public Card getCard() {
		Card card = new Card();
		return card;
	}
	
}
