package lambda;

@FunctionalInterface
interface Printing {
	
	public void print(String str); 
}


public class TestLambda {

	public static void main(String[] args) {
		
		Printing lambdaStr= s -> System.out.println(s);
		lambdaStr.print("Hello~");
		
		lambdaPrint("매개변수로 전달!");
		
		Printing p= returnPrint();
		p.print("반환 값으로 전달");
		
	}
	
	public static void lambdaPrint(String str) {
		System.out.println(str);
	}
	
	public static Printing returnPrint() {
		return s-> System.out.println(s);
	}
	
	

}
