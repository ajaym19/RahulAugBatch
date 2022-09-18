package HandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "./src/HandlingDemo/TestData";
//		FileReader reader;
//		try {
//			reader = new FileReader(filePath);
//			System.out.println(reader.read());
//		} catch (FileNotFoundException e) {
//			System.out.println("Parent Exception");
//		} catch (IOException e) {
//			// TODO: handle exception
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		/*
		 * 2 problems
		 * 1. giving me the ascii value rather than the character
		 * 2. reading only one character at a time
		 * 
		 */
		FileReader reader = new FileReader(filePath);
		//System.out.println((char)reader.read());
		int i;
		while ((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		reader.close();
		
		FileWriter writer = new FileWriter(filePath);
		writer.write("Method");
		writer.append("Hello");
		writer.close();
		
		
		
	}

}
