package collection.setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> hashSet= new HashSet<String>();
		hashSet.add("±èÃ¶¼ö");
		hashSet.add("ÀÌÈÆÀÌ");
		hashSet.add("½ÅÂ¯±¸");
		
		System.out.println(hashSet);
		
		Iterator<String> ir= hashSet.iterator();
		
		while(ir.hasNext()) {
			String s= ir.next();
			System.out.println(s);
		}
		
	}

}
