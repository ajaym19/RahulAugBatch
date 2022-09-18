package Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	/*
	 * LinkedList
	 * it is a class
	 * implementing List Interface
	 * 
	 * 
	 * insertion order
	 * duplicates
	 * index
	 */
	
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(11);
		list.add(11);
		System.out.println(list);
		
		list.addFirst(101);
		list.addLast(201);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		/*
		 * AL VS LL
		 * 
		 * list = {1,2,3,4,5,6,7,8,9}
		 * 1001, 1002, 1003, 1004
		 * list.get(3) >> 4
		 * list.remove(3) >> 
		 * list.get(3) >> 5
		 * 
		 * 
		 * LL
		 * list = {1,2,3,4,5,6,7,8,9}
		 * 
		 * null
		 * 
		 * 	34				54			763				887
		 * 
		 * 
		 */
		
		
		
		
	}
}
