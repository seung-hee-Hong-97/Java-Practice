package string;

public class StringTest2 {

	public static void main(String[] args) {

		String java= new String("java");
		String android= new String("android");
		System.out.println(System.identityHashCode(java));
		
		java= java + android;
		// java= java.concat(android); 위의 코드와 의미는 동일
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		// 처음 java의 HashCode와 두번 째 java의 HashCode가 다르게 출력이 된다.
		// 이 의미는 java와 android를 합친 걸 대입한 java에 새로운 메모리가 할당이 된 걸 알 수 있다.
		
		
		
		
	}

}
