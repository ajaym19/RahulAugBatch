package Basics;

public class StringReverse {

	/*
	 * Given a String, print the character at index 4
	 * IP: Welcome
	 * OP: c
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "Welcome";
		int index = 4;
		//getCharByIndex(str, index);
		reverseString(str);
		
		
	}
	
	public static void getCharByIndex(String str, int index) {
		System.out.println(str.charAt(index));
	}
	
	//print it in reverse
	public static void reverseString(String str) {
		System.out.println(str.length());
		int len = str.length();
		for (int i = len-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	//palindrome
}
