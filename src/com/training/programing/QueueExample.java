package com.training.programing;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
	public static void main(String[] args) {
		Queue<String> queue =new LinkedList<>();
		queue.add("java");
		queue.add("Programming");
		queue.add("is to learn");
		System.out.println(queue);
		System.out.println(queue.remove());
		queue.add("java");
		String peeked =queue.peek();
		System.out.println(peeked);
		System.out.println("after Peeked:"+queue);
	}
}
