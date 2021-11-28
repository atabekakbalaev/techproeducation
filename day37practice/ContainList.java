package day37practice;

import java.util.ArrayList;
import java.util.List;

public class ContainList {

	public static void main(String[] args) {
		List<String> expectedSSNList = new ArrayList<>();
        expectedSSNList.add("123-36-4738");
        expectedSSNList.add("615-78-8946");
    
        List<String> actualSSNList = new ArrayList<>();
        actualSSNList.add("125-83-2389");
        actualSSNList.add("736-26-8342");
        actualSSNList.add("218-28-3827");
        actualSSNList.add("615-78-8946");
        actualSSNList.add("123-36-4738");
        actualSSNList.add("837-45-2716");
        
        System.out.println(actualSSNList.contains(expectedSSNList.get(0)));
        System.out.println(actualSSNList.contains(expectedSSNList.get(1)));
//        containsAll
	}

}
