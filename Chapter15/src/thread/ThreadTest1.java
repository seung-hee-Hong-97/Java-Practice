package thread;

class MyThread extends Thread{
	
	public void run() {
		
		for(int i=0; i<30; i++) {
			System.out.print(i +" ");
			
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}



public class ThreadTest1 {

	public static void main(String[] args) {

		MyThread mth1= new MyThread();
		MyThread mth2= new MyThread();
		
		System.out.println("Start!");
		
		mth1.start();
		mth2.start();
		
		System.out.println("End!!");
		
	}

}
