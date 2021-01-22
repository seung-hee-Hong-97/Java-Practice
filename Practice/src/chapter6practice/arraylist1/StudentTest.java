package chapter6practice.arraylist1;

/* Lee 학생은 두 과목을 수강하고, Kim 학생은 세 과목을 수강한다.
   각 학생의 학점, 총점, 평균을 다음과 같이 출력해라.
   
   Student 클래스에 ArrayList 멤버변수를 하나 가지고 각 학생이 수강하는 과목을 관리하도록 한다.
   
   <출력 결과>
   	학생 이승기님의 국어 과목 성적은 95점 입니다.
	학생 이승기님의 수학 과목 성적은 100점 입니다.
	학생 이승기님의 총점은 195점 이고, 평균은 97점 입니다.
	================================
	학생 김범수님의 국어 과목 성적은 100점 입니다.
	학생 김범수님의 수학 과목 성적은 95점 입니다.
	학생 김범수님의 영어 과목 성적은 88점 입니다.
	학생 김범수님의 총점은 283점 이고, 평균은 94점 입니다.
 */


public class StudentTest {

	public static void main(String[] args) {
		
		Student lee= new Student("Lee");
		lee.addSubject("국어", 85);
		lee.addSubject("수학", 100);
		lee.showStudentInfo();
		
		System.out.println("====================================");
		
		Student kim= new Student("Kim");
		kim.addSubject("국어", 100);
		kim.addSubject("수학", 90);
		kim.addSubject("영어", 85);
		kim.showStudentInfo();
		
	}

}
