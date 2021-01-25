package thread;

class Bank2 {
	
	private int money= 10000;
	
	public synchronized void saveMoney(int saveMoney) {
		int m= this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
		setMoney(m + saveMoney);
	}

	public synchronized void minusMoney(int minusMoney) {
		int m= this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
		setMoney(m - minusMoney);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}

class Park2 extends Thread {
	
	public void run() {
		System.out.println("Start Save!");
		SyncTest2.myBank.saveMoney(5000);
		System.out.println("Save Money: " + SyncTest2.myBank.getMoney());
	}
}

class ParkWife2 extends Thread {
	
	public void run() {
		System.out.println("Start Minus");
		SyncTest2.myBank.minusMoney(4000);
		System.out.println("Minus Money: " + SyncTest2.myBank.getMoney());
	}
}


public class SyncTest2 {
	
	public static Bank2 myBank= new Bank2();

	public static void main(String[] args) throws InterruptedException  {

		Park2 p= new Park2();
		ParkWife2 pw= new ParkWife2();
		
		p.start();
		
		Thread.sleep(200);
		
		pw.start();
		
		
	}

}
