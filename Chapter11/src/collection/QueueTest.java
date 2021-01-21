package collection;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> queue= new ArrayList<String>();
	
	public void enqueue(String s) {
		queue.add(s);
	}
	
	public String dequeue() {
		int len= queue.size();
		if(len == 0) {
			return "Queue가 비어 있습니다.";
		}
		return queue.remove(0);
	}
	
	
	
}



public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue= new MyQueue();
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		

	}

}
