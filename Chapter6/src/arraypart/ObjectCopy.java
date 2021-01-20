package arraypart;

public class ObjectCopy {

	public static void main(String[] args) {

		// 객체 배열의 얕은 복사
		Book library[]= new Book[5];
		Book copyLibrary[]= new Book[5];
		
		library[0]= new Book("검도1", "이정신");
		library[1]= new Book("검도2", "이정신");
		library[2]= new Book("검도3", "이정신");
		library[3]= new Book("검도4", "이정신");
		library[4]= new Book("검도5", "이정신");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*for(Book b: library) {
			b.showBookInfo();
		} */
		
		library[0].setTitle("태권도1");
		library[0].setAuthor("김곡선");
		
		for(Book l: library) {
			l.showBookInfo();
		}
		
		System.out.println("===========================");
		
		for(Book c: copyLibrary) {
			c.showBookInfo();
		}
	}

}
