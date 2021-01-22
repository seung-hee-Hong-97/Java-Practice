package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int arr[]= new int[3];
		
		try {
			for(int i=0; i<4; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생하였다.");
			System.out.println(e);
		} finally {
			System.out.println("프로그램 종료");
		}
		
		
	}

}
