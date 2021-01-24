package stream.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest2 {

	public static void main(String[] args) {

		byte bs[]= new byte[26];
		byte data= 65;
		
		for(int i=0; i<bs.length; i++) {
			bs[i]= data;
			data++;
		}
		
		try(FileOutputStream fos= new FileOutputStream("alphabet.txt");
				FileInputStream fis= new FileInputStream("alphabet.txt")) {
			
			fos.write(bs);
			
			int ch;
			while( (ch= fis.read()) != -1) {
				System.out.print((char) ch + " ");
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		
		
	}

}
