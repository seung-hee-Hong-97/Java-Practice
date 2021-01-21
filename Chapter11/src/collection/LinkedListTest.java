package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> list= new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		list.add(2, "D");
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);
		
		for(String s: list) {
			System.out.println(s);
		}
		
	}

}
