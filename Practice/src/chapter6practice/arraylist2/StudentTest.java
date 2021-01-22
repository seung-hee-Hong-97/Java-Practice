package chapter6practice.arraylist2;

/* Student 클래스를 만들고 각 학생마다 읽은 책을 Student 클래스 내에 ArrayList를 생성하여 관리하도록 해라.
   다음과 같이 출력되도록 Student, Book, StudentTest 클래스를 만들어 실행하라
   
   <출력 결과>
   Lee 학생이 읽은 책은: 태백산백1, 태백산맥2 입니다.
   Kim 학생이 읽은 책은: 토지1, 토지2, 토지3 입니다.
   Cho 학생이 읽은 책은: 해리포터1, 해리포터2, 해리포터3, 해리포터4, 해리포터5, 해리포터6 입니다.
 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee= new Student("Lee");
		lee.addBook("태백산맥1");
		lee.addBook("태백산맥2");
		lee.showStudentInfo();
		
		Student kim= new Student("Kim");
		kim.addBook("토지1");
		kim.addBook("토지2");
		kim.addBook("토지3");
		kim.showStudentInfo();
		
		Student cho= new Student("Cho");
		cho.addBook("해리포터1");
		cho.addBook("해리포터2");
		cho.addBook("해리포터3");
		cho.addBook("해리포터4");
		cho.addBook("해리포터5");
		cho.addBook("해리포터6");
		cho.showStudentInfo();
		
		
	}

}
