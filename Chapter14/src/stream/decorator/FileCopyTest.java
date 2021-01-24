package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long milliseconds= 0;
		
		try(FileInputStream fis= new FileInputStream("b.exe");
				BufferedInputStream bis= new BufferedInputStream(fis);
				FileOutputStream fos= new FileOutputStream("copy.exe");
				BufferedOutputStream bos= new BufferedOutputStream(fos)) {
			
			milliseconds= System.currentTimeMillis();
			
			int i;
			while( (i= bis.read()) != -1) {
				bos.write(i);
			}
			
			milliseconds= System.currentTimeMillis() - milliseconds;
			
			System.out.println("걸린 시간: " + milliseconds);
			
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		
		
		/* 데코레이터 페턴 (Decorator Pattern)
		Socket socket= new Socket();
		
		BufferedReader isr= new BufferedReader (new InputStreamReader(socket.getInputStream()));
		isr.readLine(); */
		
		
		
	}

}
