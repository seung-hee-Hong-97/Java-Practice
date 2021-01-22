package stream;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList= new ArrayList<String>();
		sList.add("Kim");
		sList.add("Joker");
		sList.add("Park");
		
		sList.stream().forEach(s->System.out.print(s +" "));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		
		sList.stream().map(s->s.length()).forEach(s->System.out.println(s));
		
		
	}

}
