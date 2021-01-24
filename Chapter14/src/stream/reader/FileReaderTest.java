package stream.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		/* 1. FileInputStream에 보조 스트림인 InputStreamReader를 사용해 바이트 단위로 읽는 자료를 문자 단위로
		      변환해주는 방식 
		 
		FileInputStream fis= new FileInputStream("reader.txt");
		InputStreamReader isr= new InputStreamReader(fis);
		
		try {
			int i;
			while( (i= isr.read()) != -1) {
				System.out.print((char) i);
			}
		}catch(IOException e) {
			System.out.println(e);
		} */
		
		
		// 2. 문자 단위 스트림인 FileReader를 사용해 문자 단위로 자료를 읽는 방식
		FileReader fr= new FileReader("reader.txt");
		
		try {
			int i;
			while( (i= fr.read()) != -1) {
				System.out.print((char) i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
	}

}
