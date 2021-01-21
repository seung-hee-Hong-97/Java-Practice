package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet= new TreeSet<String>();
		treeSet.add("È«±æµ¿");
		treeSet.add("±èÀ¯½Å");
		treeSet.add("ÀÌ¼ø½Å");
		
		System.out.println(treeSet);
		
		Iterator<String> ir= treeSet.iterator();
		
		while(ir.hasNext()) {
			String s= ir.next();
			System.out.println(s);
		}
		
	}

}
