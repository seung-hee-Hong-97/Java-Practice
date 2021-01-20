package classpart;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println("학번: " + studentID + ", 이름: " + studentName + ", 주소: " + address);
	}
	
	public String getName() {
		return studentName;
	}
}
