package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	String name;
	String job;
	
	public Person(String name, String job) {
		this.name= name;
		this.job= job;
	}
	
	public String toString() {
		return "이름: " + this.name +", 직업: " + this.job;
	}
	
}


public class SerializationTest {

	public static void main(String[] args){

		Person park= new Person("박서준", "배우");
		Person son= new Person("손흥민", "축구선수");
		
		try(FileOutputStream fos= new FileOutputStream("serial.txt");
				ObjectOutputStream oos= new ObjectOutputStream(fos)) {
			
			oos.writeObject(park);
			oos.writeObject(son);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis= new FileInputStream("serial.txt");
				ObjectInputStream ois= new ObjectInputStream(fis)) {
			
			Person p1= (Person) ois.readObject();
			Person p2= (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch(IOException e) {
			System.out.println(e);
			
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		
	}

}
