package day31collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

	public static void main(String[] args) {
		Deque<String> dq1 = new LinkedList<>();
		dq1.addFirst("A");
		dq1.addFirst("B");
		dq1.addFirst("C");
		dq1.add("D");
		System.out.println(dq1.getFirst());
		System.out.println(dq1.getLast());
		
		System.out.println(dq1);
	}

}
