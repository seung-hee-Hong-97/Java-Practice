package innerclass;

import innerclass.OutClass.InClass;

class OutClass {
	
	private int num= 10;
	private static int sNum= 20;
	private InClass iClass;
	
	public OutClass() {
		iClass= new InClass();
	}
	
	class InClass {
		int iNum= 100;
		
		void test() {
			System.out.println(iNum);
			System.out.println(sNum);
			System.out.println(num);
		}
	}
	
	public void usingMethod() {
		iClass.test();
	}
	
	
	static class SinClass {
		int isNum= 30;
		static int issNum= 50;
		
		void test() {
			System.out.println(isNum);
			System.out.println(issNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			System.out.println(issNum);
			System.out.println(sNum);
		}
	}
	
}


public class InnerTest {

	public static void main(String[] args) {
		
		// 1. 외부 클래스에서 인스턴스 내부 클래스에 있는 메서드 사용하기
		OutClass oClass= new OutClass();
		oClass.usingMethod();
		
		System.out.println();
		// 2. 인스턴스 내부 클래스에 있는 메서드 호출하기
		OutClass.InClass iClass= oClass.new InClass();
		iClass.test();

		System.out.println();
		// 3. 정적(static) 내부 클래스에 있는 메서드 호출하기
		OutClass.SinClass siClass= new OutClass.SinClass();
		siClass.test();
		System.out.println();
		
		OutClass.SinClass.sTest();
		
	}

}
