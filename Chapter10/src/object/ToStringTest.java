package object;

class Book implements Cloneable{
	
	public String title;
	public String author;
	
	public Book(String title, String author) {
		this.title= title;
		this.author= author;
	}
	
	public String toString() {
		return "力格: " + title + ", 历磊: " + author;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	
}

public class ToStringTest  {

	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Book person1= new Book("扁积面", "豪霖龋");
		System.out.println(person1);
		
		Book person2= (Book) person1.clone();
		System.out.println(person2);
		
		
	}

}
