package innerclass;

class Outer2 {
	
	private int outNum= 10;
	private static int sNum= 20;
	
	public Runnable getRunnable(int i) {
		int num= 100;
		
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(i);
				System.out.println(num);
			}
			
		};
	}

	Runnable runner= new Runnable() {

		@Override
		public void run() {
			System.out.println("인터페이스 타입의 변수에 new 키워드를 사용하여 익명 내부 클래스 생성");
		}
		
	};
	
	
	
}


public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		
		Outer2 oClass= new Outer2();
		
		Runnable runnable= oClass.getRunnable(30);
		runnable.run();
		
		oClass.runner.run();
		
		
	}

}
