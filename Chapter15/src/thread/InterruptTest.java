package thread;

public class InterruptTest extends Thread{

	public void run() {
		
		for(int i=0; i<30; i++) {
			System.out.print(i + " ");
		}
		
		try {
			Thread.sleep(3500);
			
		} catch(InterruptedException e) {
			System.out.println(e);
			System.out.println("Wake up");
		}
	}
	
	
	
	public static void main(String[] args) {

		InterruptTest test= new InterruptTest();
		test.start();
		test.interrupt();
		
	}

}
