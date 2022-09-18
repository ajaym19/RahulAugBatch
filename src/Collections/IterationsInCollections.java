package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationsInCollections {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(23);
		list.add(34);
		list.add(453);
		list.add(275);
		
		System.out.println("Using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Using for each loop");
		for(Integer temp : list) {
			System.out.println(temp);
		}
		
		System.out.println("Using Iterator");
		Iterator<Integer> it = list.iterator();
		//2 methods >>
		//hasNext() >> it will tell you if there is a next element
		//next() >> will return you the next element
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}
}
