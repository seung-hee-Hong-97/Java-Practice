package chapter5practice;

/*
 다음 객체에 대한 설명에 맞는 클래스를 만들고 값을 출력해 보세요
 나이가 40살, 이름이 James라는 남자가 있다. 이 남자는 결혼을 했고, 자식이 셋이 있습니다.
 
 <출력 결과>
 나이: 40
 이름: James
 결혼여부: true
 자녀 수: 3
 */
public class Task1 {
	int age;
	String name;
	boolean isMarried;
	int numberOfChildren;
	
	public void showPerson() {
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("결혼 여부: " + isMarried);
		System.out.println("자녀 수: " + numberOfChildren);
	}
	
	
	
	public static void main(String[] args) {
		Task1 person= new Task1();
		person.age= 40;
		person.name= "James";
		person.isMarried= true;
		person.numberOfChildren= 3;
		
		person.showPerson();
		
	}

}
