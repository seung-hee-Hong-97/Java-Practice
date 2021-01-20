package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student lee= new Student(10020, "이윤도");
		lee.setKoreaSubject("국어", 85);
		lee.setMathSubject("수학", 90);
		lee.showStudentInfo();
		
		System.out.println();
		
		Student kim= new Student(30231, "김충신");
		kim.setKoreaSubject("국어", 90);
		kim.setMathSubject("수학",  87);
		kim.showStudentInfo();
	
	
	
	}
}