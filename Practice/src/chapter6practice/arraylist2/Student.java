package chapter6practice.arraylist2;

import java.util.ArrayList;

public class Student {
	
	private String name;
	
	ArrayList<Book> bList;
	
	public Student(String name) {
		this.name= name;
		bList= new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addBook(String title) {
		Book book= new Book(title);
		bList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(name +" 학생이 읽은 책들은: ");
		for(int i=0; i<bList.size()-1; i++) {
			System.out.print(bList.get(i).getTitle() +", ");
		}
		System.out.println(bList.get(bList.size()-1).getTitle() +" 입니다.");
	}
	
}
