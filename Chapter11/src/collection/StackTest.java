package collection;

import java.util.ArrayList;

class Stack {
	
	private ArrayList<String> stackList;
	
	public Stack() {
		stackList= new ArrayList<String>();
	}

	public ArrayList<String> getStackList() {
		return stackList;
	}

	public void setStackList(ArrayList<String> stackList) {
		this.stackList = stackList;
	}
	
	public void push(String s) {
		stackList.add(s);
	}
	
	public String pop() {
		int len= stackList.size();
		if(len == 0) {
			return "Stack은 비어 있습니다.";
		}
		return stackList.remove(len-1);
	}
	
}


public class StackTest{

	public static void main(String[] args) {
		
		Stack stack= new Stack();
		stack.push("a");
		stack.push("c");
		stack.push("b");
		stack.push("d");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
}
