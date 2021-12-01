package day31collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// if you use LinkedList constructor to create an object in Queue
		// data type, the elements will be in insertion order
		Queue<String> q1 = new LinkedList<String>();
		System.out.println(q1.offer("A"));
		System.out.println(q1);
		
		/*
		 * If you use PriorityQueue constructor to create an object
		 * in Queue data type, the elements will be in order according to the rule
		 * Java decided. But we are able to create our own rules to sort elements
		 * We will learn it in lambda course.
		 */
		Queue<String> q2 = new PriorityQueue<String>();
	}

}
