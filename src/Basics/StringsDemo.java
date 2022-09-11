package Basics;


public class StringsDemo {

	/*
	 * String:
	 * sequence of characters
	 * ajay
	 * String is a non primitive data type
	 * String is a class
	 * 
	 * 2 ways to declare a String
	 * 1. String Literal:
	 * 		in this case, if an object with the same value already exists, new object will not be created
	 * 
	 * 2. using new keyword
	 * 		in this case, even if the object with the same value is present, still it will create a new object
	 * 
	 * Rules:
	 * 1. String objects are immutable 
	 * 2. 
	 */
	
	public static void main(String[] args) {
		String name = "Ajay";
		System.out.println(name);
		System.out.println(name.length());
		
		name = name.concat("Trainer");
		System.out.println(name); //?
		
		String dept ="IT";
		System.out.println(dept);
		
		String s1 = new String("Hello");
		s1 = s1.concat("World");
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(" to my session");
		System.out.println(sb);//
		
		String sample = "I am Ajay";
		//HW print reverse without using inbuilt method
		//verify if the given sprint is palindrome or no
		//madam - Yes, ajay - No, aba- yes
		
		StringBuffer sb1 = new StringBuffer(sample);
		String reversedString = sb1.reverse().toString();
		System.out.println(reversedString);
		
		System.out.println(sb.charAt(2));
		System.out.println(sb.deleteCharAt(2));
		
		// == or .equals
		
		/*
		 * ==, it will compare if both the variables are pointing to the same object
		 * .equals, it will check if the content of both the string is same or no
		 */
		
		String s11 = "Ajay";
		String s12= "Ajay";//no
		System.out.println(s11 == s12); //yes
		System.out.println(s11.equals(s12)); //yes
		
		String s13 = new String("abc");
		String s14 = new String("abc");
		System.out.println(s13 == s14); //
		System.out.println(s13.equals(s14));

		
		String s15 = "XYZ";
		String s16 = new String("XYZ");
		System.out.println(s15 == s16); 
		System.out.println(s15.equals(s16));
		
	}
}
