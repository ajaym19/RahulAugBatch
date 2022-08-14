package Basics;

public class DataTypeConversionDemo {

	/*
	 * Bucket Theory Bucket1 >> 5L Bucket2 >> 3L
	 * 
	 * Task: To Transfer all the water 1. From B2 to B1 >> able to do 2. From B1 to
	 * B2 >> there is chances of loss
	 * 
	 * Higher to Lower >> error 
	 * Lower to Higher >> works fine
	 */

	public static void main(String[] args) {

		byte sid;

		// this variable value is assigned by some external integrations
		// below varaible is declared in external system
		int studentId = 13;
		sid = (byte) studentId; // casting needs to be applied
		// studentId = sid;

		System.out.println(studentId);
		System.out.println(sid);

		int i1 = 45;
		long l1 = i1;

		float f1 = 45.95f;
		double d1 = f1;
		f1 = (float) d1;

		int i3 = (int) f1;
		System.out.println("Float value is " + f1);
		System.out.println("Int value is " + i3);

		
		//character to int
		
		char c1 = '1';
		int i4 = c1;
		
		System.out.println(c1); //1
		System.out.println(i4); //1
		//ASCII character
		
		//int to character
		int i5 = 97;
		char c2 =(char)i5;
		System.out.println(c2); //
		
		
		//Int to string

		// boolean
		
		int i10 = 45;
		System.out.println(i10);
		
		
		//Integer to String
		int i11 = 451;
		String s1 = Integer.toString(i11);
		System.out.println(i11);
		System.out.println(s1);
		
		//String usage
		System.out.println(i11+10); //461
		System.out.println(s1+10); //45110
		
		System.out.println("Ajay"+"Trainer"); //Ajay
		System.out.println("Ajay"+10+10);//Ajay1010
		//AJay10 +10 >> Ajay1010
		System.out.println(10+20+"Ajay"+10);//
		//30 + Ajay + 10 >> 30Ajay+10 >> 30Ajay10
		
		//String to Int
		String s3 = "123";
		int i13 = Integer.parseInt(s3);
		System.out.println(s3);
		System.out.println(i13);
		
		//Double to String
		double d3 = 45;
		String s4 = Double.toString(d3);
		
		
		
	}
}
