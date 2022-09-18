package Collections;

import java.util.HashSet;

public class HashSetDemo {

	/*
	 * HashSet:
	 * is a class implementing Set Interface
	 * internally it uses the concept of Hashing
	 * 
	 * Rules:
	 * 1. Insertion Order is not maintained
	 * 2. There is no order
	 * 3. Duplicates are not allowed
	 * 
	 * Which one to use?
	 * 1. Are we allowing duplicates
	 * 2. Are we gonna frequently update the list or remove items
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		java.util.HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		System.out.println(set);
		set.add(79);
		System.out.println(set);
		set.add(34);
		set.add(34);
		System.out.println(set);
		System.out.println(set.contains(79));
		
		//for each
		
		
		
		
		
	}
}
