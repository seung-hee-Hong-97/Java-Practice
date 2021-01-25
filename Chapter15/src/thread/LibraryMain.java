package thread;

import java.util.ArrayList;

class Library {
	
	public ArrayList<String> books;
	
	public Library() {
		books= new ArrayList<String>();
		books.add("토지");
		books.add("태백산맥");
		books.add("해리포터");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t= Thread.currentThread();
		
		while(books.size() == 0) {
			System.out.println(t.getName() + ": Waiting Start");
			wait();
			System.out.println(t.getName() + ": Waiting End");
		}
		
		String title= books.remove(0);
		System.out.println(t.getName() +": " + title + " Lend");
		return title;
		
	}
	
	public synchronized void returnBook(String title) {
		Thread t= Thread.currentThread();
		
		books.add(title);
		notifyAll();
		System.out.println(t.getName() + ": " + title + " Return");
	}
	
}

class Student extends Thread {
	
	public void run() {
		
		try {
			String title= LibraryMain.library.lendBook();
			if(title == null) return;
			Thread.sleep(4000);
			LibraryMain.library.returnBook(title);
			
		} catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class LibraryMain {

	public static Library library= new Library();
	
	public static void main(String[] args) {

		Student std1= new Student();
		Student std2= new Student();
		Student std3= new Student();
		Student std4= new Student();
		Student std5= new Student();
		Student std6= new Student();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		
	}

}
