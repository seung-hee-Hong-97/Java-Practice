package thread;

class Bank3 {
	
	private int money= 20000;

	public void saveMoney(int save) {
		int m= this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
		setMoney(m + save);
	}
	
	public void minusMoney(int minus) {
		int m= this.getMoney();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park3 extends Thread {
	
	public void run() {
		synchronized (SyncTest3.myBank) {
			System.out.println("Start Save!");
			SyncTest3.myBank.saveMoney(4000);
			System.out.println("Save Money: " + SyncTest3.myBank.getMoney());
		}
		
	}
}

class ParkWife3 extends Thread {
	
	public void run() {
		synchronized (SyncTest3.myBank) {
			System.out.println("Start Minus!");
			SyncTest3.myBank.minusMoney(5000);
			System.out.println("Minus Money: " + SyncTest3.myBank.getMoney());
		}
	}
}

public class SyncTest3 {
	
	public static Bank3 myBank= new Bank3();

	public static void main(String[] args) throws InterruptedException{
		
		Park3 p= new Park3();
		p.start();
		
		Thread.sleep(300);
		
		ParkWife3 pw= new ParkWife3();
		pw.start();
		
	}

}
