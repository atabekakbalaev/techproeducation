package day37practice;

import java.util.*;
import java.util.Map.Entry;
public class ConvertMapToListTeachersSolution {
	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Honda", 2021);
		map1.put("Toyota", 2018);
		map1.put("Porche", 2020);
		map1.put("Ferrari", 2017);
		map1.put("Mercedes", 2013);
		System.out.println(map1);
		
		//Print all the keys on the console
		//way 1)
		Set<String> keys =  map1.keySet();
		System.out.println(keys);
		//way 2)
		List<String> keys2 = new ArrayList<>(map1.keySet());
		System.out.println(keys2);
		
		//Print all the values on the console
		//way 1)
		Collection<Integer> values1=  map1.values();
		System.out.println(values1);
		//way 2)
		List<Integer> values2 = new ArrayList<>(map1.values());
		System.out.println(values2);
		
		//Print all the entries on the console in different lines
		List<Entry<String,Integer>> entries = new ArrayList<>(map1.entrySet());
		System.out.println(entries);
		
		for(Entry<String,Integer> w : entries) {
			System.out.println(w);
		}
		
	}
}