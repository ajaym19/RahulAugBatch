package Basics;

public class DataTypesDemo {

	/*
	 * Data Type:
	 * we use variables to store data
	 * 
	 * every variables we use, we need to define the data type
	 * 
	 * 1. Primitive: There are 8 primitive data types in JAVA
	 * 		Integers: byte, short, int, long
	 * 		Decimal : float, double
	 * 		Character: char
	 * 		yes/no: boolean
	 * 		
	 * 2. Non Primitive
	 * String: String
	 * Array, list
	 * 
	 */
	
	public static void main(String[] args) {
		byte b = 45; //-128 to 127
		short s = 450;
		short s1 = 32767;// -32k; to 32k
		int i = 32768; //-2^31 to +2^31
		long l = 34343434;
		
		//int j = 45.54; this will give an error
		
		double d1 = 45.565; //8 bytes
		System.out.println(d1);
		float f1 = 45.23f; //4  bytes
		System.out.println(f1);
		
		//Character
		//for characters we always use single quotes
		char c1 = 'a';
		char c2 = '%';
		//char c3 = "ajay";
		//char c4 = "a";
		System.out.println(c2);
		
		//String: sequence of characters is called as string
		//For string we use double quotes
		String s2 = "ajay";
		String s3 = "123";
		String s4 = "a";
		String s5 = "";
		
		String name = "Ajay";
		System.out.println(name); //Ajay
		System.out.println("name"); //name
		
		
		boolean isPresent = false;
		boolean b1 = true; 
		//boolean b2 = "true"; //error
		boolean b3 = false; 
		//boolean b4 = "false"; //error
		
		//boolean b5 = 1; // error, try this in C language
		//boolean b6 = 0; //error
		//boolean b7 = True; //error, case sensitive
		//boolean b8 = False; //error, case sensitive
		
		System.out.println(isPresent);
		//System.out.println(ISPRESENT); //case sensitive
		
		
		//Next Topic: Data Type Conversion
		
		
		
	}
}
