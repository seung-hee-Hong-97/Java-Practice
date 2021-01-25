package thread;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	private boolean flag= false;
	
	public TerminateThread(String name) {
		super(name);
	}

	public void run() {
		
		while(!flag) {
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(getName() + " End");
	}
	
	public void setFlag(boolean flag) {
		this.flag= flag;
	}
	
	public static void main(String[] args) throws IOException   {

		TerminateThread tmtA= new TerminateThread("A");
		TerminateThread tmtB= new TerminateThread("B");
		
		tmtA.start();
		tmtB.start();
		
		System.out.println("입력하세요 (종료하려면 M을 입력)");
		
		int in;
		while(true) {
			in= System.in.read();
			if(in == 'A' || in == 'a') {
				tmtA.setFlag(true);
			}
			else if(in == 'B' || in == 'b') {
				tmtB.setFlag(true);
			}
			else if(in == 'M' || in == 'm') {
				tmtA.setFlag(true);
				tmtB.setFlag(true);
				break;
			}
		}
		
		System.out.println("Main End");
		
	}

}
