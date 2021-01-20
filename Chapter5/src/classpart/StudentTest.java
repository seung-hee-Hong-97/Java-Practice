package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student lee= new Student();
		lee.studentID= 10010;
		lee.studentName= "이율곡";
		lee.address= "경기도 수원시";
		
		lee.showStudentInfo();
		System.out.println(lee.getName());
	}

}
