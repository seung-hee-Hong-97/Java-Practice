package chapter9practice;

public class Quick implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void print() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("QuickSort 입니다.");
	}
}
