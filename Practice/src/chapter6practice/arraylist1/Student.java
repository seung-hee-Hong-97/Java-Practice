package chapter6practice.arraylist1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
	
	private String name;
	
	ArrayList<Subject> sList;
	
	public Student(String name) {
		this.name= name;
		sList= new ArrayList<Subject>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject= new Subject(subjectName, score);
		sList.add(subject);
	}
	
	public void showStudentInfo() {
		DecimalFormat form= new DecimalFormat("#.##");
		int total= 0;
		for(Subject s: sList) {
			total += s.getScore();
			System.out.println("학생 " + this.name +"님의 " + s.getSubjectName() +" 과목 성적은 " + s.getScore() + "점 입니다.");
		}
		String average= form.format((double) total / sList.size());
		System.out.println("학생 " + this.name + "님의 총점은 " + total +"점 이고, 평균은 " + average + "점 입니다.");
	}
	
	
	
}
