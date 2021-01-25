package thread;


public class JoinTest extends Thread{
	
	int start;
	int end;
	int total= 0;
	
	public JoinTest(int start, int end) {
		this.start= start;
		this.end= end;
	}
	
	public void run() {
		
		for(int i= start; i<=end; i++) {
			total += i;
		}
	}
	
	
	public static void main(String[] args) {
		
		JoinTest jt1= new JoinTest(1, 49);
		JoinTest jt2= new JoinTest(50, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();
			jt2.join();
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("jt1ÀÇ total: " + jt1.total);
		System.out.println("jt2ÀÇ total: " + jt2.total);
		
		int sum= jt1.total + jt2.total;
		
		System.out.println("ÃÑÇÕÀº " + sum);
		
	}

}
