package chapter9practice;

import java.io.IOException;

/* 다음과 같이 여러 정렬 구현 알고리즘이 입력에 따라 실행될 수 있도록 구현해라
 	<출력 결과>
 	정렬방식을 선택하세요.
	B: BubbleSort
	H: HeapSort
	Q: QuickSort
	h
	HeapSort ascending
	HeapSort descending
	숫자를 정렬하는 알고리즘 입니다.
	HeapSort 입니다.
 */

public class SortTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B(b): BubbleSort");
		System.out.println("H(h): HeapSort");
		System.out.println("Q(q): QuickSort");
		
		int ch= System.in.read();
		
		Sort sort= null;
		
		if(ch == 'B' || ch == 'b') {
			sort= new Bubble();
		}
		else if(ch == 'H' || ch == 'h') {
			sort= new Heap();
		}
		else if(ch == 'Q' || ch == 'q') {
			sort= new Quick();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		
		int arr[]= new int[10];
		
		try {
			sort.ascending(arr);
			sort.descending(arr);
			sort.print();
		} catch(Exception e) {
			System.out.println("다시 시도하세요");
			System.out.println(e);
		}
	
	}

}
