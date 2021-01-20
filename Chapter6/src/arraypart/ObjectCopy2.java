package arraypart;

public class ObjectCopy2 {

	public static void main(String[] args) {

		// 객체배열의 깊은 복사
		Book library[]= new Book[5];
		Book copyLibrary[]= new Book[5];
		
		library[0]= new Book("검도1", "이정신");
		library[1]= new Book("검도2", "이정신");
		library[2]= new Book("검도3", "이정신");
		library[3]= new Book("검도4", "이정신");
		library[4]= new Book("검도5", "이정신");
		
		copyLibrary[0]= new Book();
		copyLibrary[1]= new Book();
		copyLibrary[2]= new Book();
		copyLibrary[3]= new Book();
		copyLibrary[4]= new Book();
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("무극1");
		library[0].setAuthor("김정권");
		
		for(Book l: library) {
			l.showBookInfo();
		}
		
		System.out.println("=========================");
		
		for(Book c: copyLibrary) {
			c.showBookInfo();
		}
		
	}

}
