package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {

		/*FileInputStream fis= null;
		
		try {
			fis= new FileInputStream("a.txt");
			System.out.println("성공적으로 파일을 찾았습니다.");
			
		} catch(FileNotFoundException e) {
			System.out.println(e);
			
		} finally {
			try {
				fis.close();
				System.out.println("성공적으로 close()를 호출했습니다.");
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("End"); */
		
		
		try(FileInputStream fis= new FileInputStream("a.txt")) {
			
			System.out.println("성공적으로 파일을 찾았다.");
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		
		} catch (IOException e) {
			System.out.println(e);
			
		} finally {
			System.out.println("Finally");
		}
		
		System.out.println("End");
		
	}

}
