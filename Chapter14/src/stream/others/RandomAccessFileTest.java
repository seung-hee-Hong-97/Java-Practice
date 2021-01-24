package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf= new RandomAccessFile("random.txt", "rw");
		
		raf.writeChar('B');
		System.out.println(raf.getFilePointer());
		
		raf.writeDouble(3.14159);
		raf.writeUTF("æ»≥Á«œººø‰");
		raf.writeInt(25);
		
		raf.seek(0);
		
		char ch= raf.readChar();
		double db= raf.readDouble();
		String str= raf.readUTF();
		int i= raf.readInt();
		
		System.out.println(ch);
		System.out.println(db);
		System.out.println(str);
		System.out.println(i);
		
		raf.close();
		
	}

}
