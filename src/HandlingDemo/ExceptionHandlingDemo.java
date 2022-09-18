package HandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {

	/*
	 * Exceptions:
	 * 
	 * unusual or unwanted unplanned event in our flow of execution
	 * 
	 * 2 types:
	 * 1. Compile Time: error is thrown while code compilation
	 * 2. Run Time: error is thrown when we execute the code
	 * 
	 * so we need to handle the exception
	 * we user try-catch-finally block
	 * 
	 * try- risky code, will be executed everytime
	 * catch - what to do if exception has occurred in try block, executed only if there is exception
	 * finally - what should be done, irrespective of exception present or no, executed ever time
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		FileReader reader = null;
		
		try {
			reader = new FileReader("C:/remoteserverIP/filename.doc");
		} catch (Exception e) {
			//read file from local machine
			System.out.println("Please give correct file name and folder");
		} finally {
			//close the file connection
		}
		
		System.out.println("Ajay");
		
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			System.out.println("Division by zero is not allowed");
		}
		
		
		System.out.println("JAVA");
		
		int[] a = new int[] {1,2,3};
	//	System.out.println(a[12]);
		
		String name = null;
		System.out.println(name.length());
		
		
		
		
		
		
		
		
		/*
		 * try{
		 * get a book on Core JAVA by author ABC
		 * }
		 * catch{
		 * get any core java book
		 * }
		 * finally{
		 * come and give the book to me
		 * }
		 * 
		 * ------------
		 * removing money from locker
		 * 
		 * 
		 * 
		 * 
		 */
		
	}
}
