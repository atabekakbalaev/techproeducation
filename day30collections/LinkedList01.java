package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Can");
		ll1.add("Mark");
		ll1.add("Tom");
		
		// how to print LinkedList
		System.out.println(ll1);
		String firstElement = ll1.element(); // element() returns the first element without removing, 
		// which is implemented from List interface. element() also throws NoSuchElementException for the empty linked list
		System.out.println(firstElement);
		System.out.println(ll1);
		
		String firstElementRemoved = ll1.poll();
		System.out.println(firstElementRemoved);
		System.out.println(ll1);
		
		String firstElement2 = ll1.getFirst(); // getFirst() returns the first element without removing, 
		// which is implemented from Queue interface
		System.out.println(firstElement2);
		System.out.println(ll1);
		
//		String firstElementFromEmptyLL1 = ll1.peek(); // peek() returns the first element without removing it, if the list is empty
		// there will be NoSuchElementException
		
	}
}
