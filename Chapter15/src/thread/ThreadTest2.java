package thread;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		
		for(int i=0; i<30; i++) {
			System.out.print(i+ " ");
			
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
}


public class ThreadTest2 {

	public static void main(String[] args) {

		MyThread2 mth1= new MyThread2();
		MyThread2 mth2= new MyThread2();
		
		Thread run1= new Thread(mth1);
		Thread run2= new Thread(mth2);
		
		run1.start();
		run2.start();
		
		System.out.println();
		
		/*Thread t= Thread.currentThread();
		System.out.println(t); */
		
	}

}
