package innerclass;

class Outer {
	
	private int outNum= 100;
	private static int sNum= 200;
	
	public Runnable getRunnable(int i) {
		int num= 10;
		
		class MyRunnable implements Runnable {
			
			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(i);
				System.out.println(num);
			}
			
		}
		return new MyRunnable();
		
	}
	
	
}



public class LocalInnerClassTest {

	public static void main(String[] args) {

		Outer oClass= new Outer();
		
		Runnable runnable= oClass.getRunnable(80);
		runnable.run();
		
		
	}

}
