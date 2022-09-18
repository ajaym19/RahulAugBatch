package Collections;

import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	/*
	 * HashMap
	 * 1. HashMap is not a part of Collections framework
	 * 2. It is coming from Map Interface 
	 * 
	 * Rules:
	 * 1. stores the elements in the form of key-value pair
	 * 2. key and value together is called as pair/bucket/entry
	 * 3. Multiple entries together is called as Entry Set
	 * 
	 * 4. Duplicate values are allowed
	 * 5. Multiple null values are allowed
	 * 6. Duplicate key is not allowed, if you try, it will override the existing value
	 * 7. only one null key is allowed
	 * 
	 */
	
	public static void main(String[] args) {
		
		java.util.HashMap<Integer, String> map;
		map = new java.util.HashMap<>();
		
		map.put(1, "Ajay");
		map.put(3, "Naresh");
		map.put(2, "Ahmed");
		map.put(4, "Charu");
		//map.put("ajay", 3);
		System.out.println(map);
		
		map.put(5, "Naresh");
		map.put(6, null);
		map.put(7, null);
		System.out.println(map);
		map.put(2, "Salman");
		map.put(null, "Amir");
		System.out.println(map);
		map.put(null, "Priya");
		System.out.println(map);
		
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Ajay"));
		
		System.out.println(map.get(2));
		System.out.println(map.get(22));
		
		System.out.println(map.isEmpty());
		
		//get all the keys in your map
		Set<Integer>  keys = map.keySet();
		System.out.println(keys);
		
		map.remove(3);
		
		//if the key is already present, do nothing else insert
		//first get all the keys, check if your key is present and then decide 
		System.out.println(map);
		map.putIfAbsent(4, "Orange");
		System.out.println(map);
		
		//how to print each key and value
		//entry set -->  null=Priya, 1=Ajay, 2=Salman, 3=Naresh, 4=Charu, 5=Naresh, 6=null, 7=null
		//entry (temp) --> 1=Ajay
		for( Entry<Integer, String> temp : map.entrySet()) {
			System.out.println("Key is " + temp.getKey() + " Value is "+temp.getValue());
		}
		
		/*
		 * mobile 20000
		 * 
		 * 
		 */
		
		
		String name = "Mobile 20000";
		String[] values = name.split(" ");
		for (String string : values) {
			//map.put(values[0],values[1])
		}
	}
	
}
