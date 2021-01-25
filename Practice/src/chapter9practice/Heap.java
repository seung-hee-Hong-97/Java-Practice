package chapter9practice;

public class Heap implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void print() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("HeapSort 입니다.");
	}
}
