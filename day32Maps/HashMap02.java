package day32Maps;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMap02 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("Ali", 5);
		hm1.put("Velihan", 7);
		hm1.put("Maria", 3);
		
		// Print all entries on the console in different lines
		Set<Entry<String, Integer>> entries = hm1.entrySet();
		for (Entry<String, Integer> e : entries) {
			System.out.println(e);
		}
	}

}
