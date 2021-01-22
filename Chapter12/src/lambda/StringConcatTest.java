package lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		
		StringCon con= new StringCon();
		con.makeString("Hello", "Java!");
		
		StringConcat concat= (s, v) -> System.out.println(s + ", " + v);
		concat.makeString("Korea", "America");
		
		StringConcat concat2= new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 +", " + s2);
			}
			
		};
		
		concat2.makeString("Method", "Overriding");
		
		
	}

}
