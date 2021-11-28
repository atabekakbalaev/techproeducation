package day33maps;

//import java.util.Arrays;
import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
//		str = str.replaceAll("\\p{Punct}", "").toLowerCase();
		str = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
		
		String [] words = str.split("");
		HashMap<String, Integer> result = new HashMap<>();
		for(String w : words) {
			Integer count = result.get(w);
			result.put(w, count == null ? 1 : count + 1);
		}
		System.out.println(result);
	}

}
