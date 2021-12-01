package day32Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		/*
		 * Maps use key-value structure
		 * keys must be unique, values can be duplicated
		 * keys cannot be null except in HashMaps only once
		 * HashMap does not put the elements in any order because of 
		 * HashMap is super fast.
		 * If you try to send into a map repeated key, Java will override
		 * HashMap is not thread-safe and not synchronized
		 */
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(100, "Ali");
		hm1.put(101, "Veliye");
		hm1.put(102, "Aliye");
		hm1.put(null, "Veli");
		hm1.put(null, "Ali");
		hm1.putIfAbsent(100, "Atabek");
		System.out.println(hm1);
		
		// if you use non-existing key get() returns "null"
		String el1 = hm1.get(100);
		System.out.println(el1);
		
		Set<Integer> myKeys = hm1.keySet();
		System.out.println(myKeys);
		
		Collection<String> myValues = hm1.values();
		System.out.println(myValues);
		
		// how to update a value in a Map
		String val1 = hm1.replace(100, "Atabek");
		System.out.println(val1);
		
		System.out.println(hm1.replace(89, "L", "Leyla"));
		
		Set<Entry<Integer, String>> entries = hm1.entrySet();
		
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry + " ");
		}
	}

}
