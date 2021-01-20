package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue books= new BookShelf();
		
		books.enQueue("ลยน้ป๊ธฦ1");
		books.enQueue("ลยน้ป๊ธฦ2");
		books.enQueue("ลยน้ป๊ธฦ3");
		
		System.out.println(books.getSize());
		
		System.out.println(books.dequeue());
		System.out.println(books.dequeue());
		System.out.println(books.dequeue());
		
		
	}

}
