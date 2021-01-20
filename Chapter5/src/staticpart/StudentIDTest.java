package staticpart;

public class StudentIDTest {

	public static void main(String[] args) {

		Student lee= new Student("Lee");
		System.out.println(Student.getSerialNum());
		
		Student kim= new Student("Kim");
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		System.out.println(lee.getStudentID());
		System.out.println(kim.getStudentID());
		System.out.println(kim.getStudentID());
		
	}

}
