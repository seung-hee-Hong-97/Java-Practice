package object;

class Student {
	
	public int studentID;
	public String name;
	
	public Student(int studentID, String name) {
		this.studentID= studentID;
		this.name= name;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			Student std= (Student) obj;
			if(this.studentID == std.studentID && this.name == std.name) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return studentID * 1111;
	}

}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student lee= new Student(1010, "ÀÌ½Â¼·");
		Student lee2= lee;
		Student lee3= new Student(1010, "ÀÌ½Â¼·");
		
		System.out.println(lee == lee2);
		System.out.println(lee == lee3);
		System.out.println(lee.equals(lee3));
		
		System.out.println(lee.hashCode() == lee2.hashCode());
		System.out.println(lee.hashCode() == lee3.hashCode());
		
		
		
		/*Integer i1= new Integer(100);
		Integer i2= new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2)); */
		
	}

}
