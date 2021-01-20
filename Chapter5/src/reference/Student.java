package reference;

public class Student {

	public int studentID;
	public String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		this.studentID= id;
		this.studentName= name;
		
		korea= new Subject();
		math= new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName= name;
		korea.score= score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName= name;
		math.score= score;
	}
	
	public void showStudentInfo() {
		int total= korea.score + math.score;
		System.out.println(this.studentName + " 학생의 " + korea.subjectName + " 점수는 " + korea.score + "점 입니다.");
		System.out.println(this.studentName + " 학생의 " + math.subjectName + " 점수는 " + math.score + "점 입니다.");
		System.out.println(this.studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
