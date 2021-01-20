package constructor;

public class StudentTest {

	public static void main(String[] args) {

		Student kim= new Student("김철수");
		kim.address= "서울시 마포구";
		kim.setStudentID(20323);
		
		Student shin= new Student(10030, "경기도 의왕시");
		shin.studentName= "신세경";
		
		kim.showStudentInfo();
		shin.showStudentInfo();
	}

}
