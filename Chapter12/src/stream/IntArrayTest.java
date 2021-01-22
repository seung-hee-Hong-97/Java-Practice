package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int arr[]= {1, 2, 3, 4, 5};
		
		int sum= Arrays.stream(arr).sum();
		int count= (int) Arrays.stream(arr).count();
		
		System.out.println(sum);
		System.out.println(count);
		
		int reduceArray= Arrays.stream(arr).reduce(1, (a, b) -> a * b);
		System.out.println(reduceArray);
		
	}

}
