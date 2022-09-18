package HandlingDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "./src/HandlingDemo/TestData";
		FileReader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		//it can read an entire line
		//System.out.println(br.readLine());
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		//next APACHE POI
	}
}
