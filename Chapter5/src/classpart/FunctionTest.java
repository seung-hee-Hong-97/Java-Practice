package classpart;

public class FunctionTest {
	
	// 반환 값이 있고, 매개변수가 있는 메서드
	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}
	
	// 반환 값이 없고, 매개변수가 있는 메서드
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 반환 값이 있고 매개변수가 없는 메서드
	public static int calcSum() {
		int sum= 0;
		
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int n1= 10;
		int n2= 30;
		
		int total= addNum(n1, n2);
		System.out.println(total);
		
		sayHello("Hello My Name is Hong");
		
		int sum= calcSum();
		System.out.println(sum);
	}

}
