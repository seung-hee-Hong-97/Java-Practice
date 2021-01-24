package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("값을 입력하세요(종료하려면 '끝'을 입력) ");
		
		try(InputStreamReader isr= new InputStreamReader(System.in)) {
			int i;
			
			while( (i= isr.read()) != '끝') {
				System.out.print((char) i + "");
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램을 종료했습니다.");
	}

}
