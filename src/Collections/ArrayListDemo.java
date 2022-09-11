package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	/*
	 * ArrayList
	 * used to store multiple values
	 * internally it uses array only but the length is dynamic
	 * 
	 * Rules:
	 * 1. Insertion Order is maintained
	 * 2. Duplicates are allowed
	 * 
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		/*
		 * Additin, updating and deleting and accessing
		 */
		
		list.add(10);
		list.add(21);
		list.add(05);
		System.out.println(list);
		list.add(231);
		System.out.println(list);
		list.add(05);
		System.out.println(list);
		
		//fetch the value
		//Getters and Setters
		
		System.out.println(list.get(2));
		
		list.set(2, 23);
		System.out.println(list);
		
		//removal
		
		list.remove(2);
		System.out.println(list);
		
		//adding at a specific index
		list.add(1, 55);
		System.out.println(list);
		
		System.out.println("Size of the list is "+list.size());
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains(2311));
		
		/*
		 * given a list, and a value
		 * tell me if the value is present in the list
		 * eg: list = [10, 55, 21, 231, 5]
		 * target = 21
		 * return true
		 */
		
//		for (int i = 0; i < list.size(); i++) {
//			Integer a = list.get(i);
//			if (a == 2121) {
//				System.out.println("True");
//			}
//		}
		
		System.out.println(list.contains(21));
		
		//removing by an object
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(501);
		list1.add(502);
		list1.add(503);
		System.out.println(list1);
		
		/*
		 * Add all the elements of list1 to original list
		 * remove all the elements of list1 from original list
		 */
		
		list.addAll(1, list1);
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);
		
		//Find max and min in list
		//Find avg in list
		//remove the duplicates from the list
		//IP = [2,4,2,6,9,6] OP = [2,4,6,9]
		
		
		
		
	}
}
