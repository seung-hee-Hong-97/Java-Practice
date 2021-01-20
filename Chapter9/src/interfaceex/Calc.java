package interfaceex;

public interface Calc {

	// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	double PI= 3.14;
	int ERROR= -9999999;
	
	// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	static int total(int arr[]) {
		int total= 0;
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("Private Method");
	}
	
	private static void myStaticMethod() {
		System.out.println("Private Static Method");
	}
}
