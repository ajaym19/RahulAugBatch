package Collections;

import java.util.Arrays;

public class ArrayDemo {

	/*
	 * Array: used to store multiple values of similar data type
	 * 
	 * 3 parts: 1. Declaration 2. Instantiation 3. Initialization
	 * 
	 * Rules: 
	 * 1. We can only store homegenous data in an array 
	 * 2. It is compulsory to define the size of an array 
	 * 3. the default value will be 0 or null
	 */
	public static void main(String[] args) {
		int[] ids; // declaration
		ids = new int[5]; // instantiation

		// [0,0,10,0,0]
		// 0,1,2,3,4 -----> Index
		// Size > 5
		// Maximum Index --> 4, Minimum INdex --->0

		ids[1] = 10;
		ids[2] = 14;
		ids[3] = 342;
		ids[4] = 1076;
		ids[3] = 345;

		// accessing element direct by index
		System.out.println(ids[2]);
		System.out.println(ids[3]);

		// accessing all the elements
		System.out.println("Using for Loop");
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		
		//create an array as numbers of length 5 and assign values as
		//10, 20, 30, 40 , 50
		//dont assign values one by one ->> use for loop
		
		int[] a;
		int b[];
		// [10,20,30,40,50]
		//	0,1,2,3,4 -----> Index
		// Size > 5
		
		System.out.println("Learning logic");
		int numbers[] = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 10*(i+1);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		//Declaration and Instantion together
		int[] c = new int[4];
		
		//Declaration and Instantion and init together
		int[] d = new int[] {1,2,3};
		int[] e = {10,32,34};
		System.out.println(e.length);
		
		//find the sum of all the elements in the array
		//find the max element in an array
		//find the min element in an array
		//pract for other data types
		
		System.out.println("Adding the values in the array");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
		
		
		char[] c13 = new char[5];
		
		/*
		 * given a array, and a value
		 * tell me if the value is present in the array
		 * 
		 */
		
		
		Arrays.sort(c13);
		

	}
}
