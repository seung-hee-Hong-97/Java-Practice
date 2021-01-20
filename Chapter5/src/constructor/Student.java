package constructor;

public class Student {
	
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		this.studentName= name;
	}
	
	public Student(int studentID, String address) {
		this.studentID= studentID;
		this.address= address;
	}
	
	public void showStudentInfo() {
		System.out.println("학번: " + this.studentID + ", 이름: "  + this.studentName + ", 주소: " + this.address);
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	
	
}
