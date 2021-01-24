package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {

		try(FileOutputStream fos= new FileOutputStream("output.txt")) {
			fos.write(65);
			fos.write(66);
			fos.write(97);
			fos.write(69);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("파일이 없었을 경우 생성완료. 생성된 파일을 확인해보세요");
		
		
	}

}
