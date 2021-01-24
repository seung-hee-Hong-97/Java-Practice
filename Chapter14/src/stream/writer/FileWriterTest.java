package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {

		FileWriter fw= new FileWriter("writer.txt");
		
		fw.write(65);
		fw.write('D');
		
		char ch[]= {'F', 'E', 'H', 'J', 'P'};

		fw.write(ch);
		fw.write(ch, 1, 3);

		String str= "æ»≥Á«œººø‰";
		
		fw.write(str);
		fw.write(str, 1, 2);
		
		fw.close();
		
		
		
		
	}

}
