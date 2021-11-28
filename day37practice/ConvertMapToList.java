package day37practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapToList {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
        map1.put("Honda", 2021);
        map1.put("Toyota", 2018);
        map1.put("Porche", 2020);
        map1.put("Ferrari", 2017);
        map1.put("Mercedes", 2013);
        
//        for (String s: map1.keySet()) {
//        	System.out.println(s);
//        }
//        
//        for(Integer s: map1.values()) {
//        	System.out.println(s);
//        }
        Set<String> keys = map1.keySet();
        System.out.println(keys);
        List<String> keys2 = new ArrayList<>(map1.keySet());
        System.out.println(keys2);
        
        // Print all the values
        Collection<Integer> values = map1.values();
        System.out.println(values);
        List<Integer> v = new ArrayList<>(map1.values());
        System.out.println(v);
        
        
        // Print all entries
        for(Entry<String, Integer> m: map1.entrySet()) {
        	System.out.println(m);
        }
	}

}
