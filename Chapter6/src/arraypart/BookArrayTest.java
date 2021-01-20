package arraypart;

public class BookArrayTest {

	public static void main(String[] args) {

		Book library[]= new Book[5];
		
		library[0]= new Book("»ç½Å1", "±èµ¿·ü");
		library[1]= new Book("»ç½Å2", "±èµ¿·ü");
		library[2]= new Book("»ç½Å3", "±èµ¿·ü");
		library[3]= new Book("»ç½Å4", "±èµ¿·ü");
		library[4]= new Book("»ç½Å5", "±èµ¿·ü");
		
		for(Book b: library) {
			b.showBookInfo();
		}
		
		
		
	}

}
