package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Queue<Integer> queue = new PriorityQueue<>();

		queue.add(34);
		queue.add(3);
		queue.add(90);
		queue.add(65);
		queue.offer(4);

		System.out.println(queue);

		queue.peek();
		queue.remove(4);

		System.out.println(queue);

		queue.poll();
		System.out.println(queue);


		for (int i = 0; i < queue.size(); i++) {
			queue.add(544);
			System.out.println(queue);
			break;
		}
		int i = 0;
		while (i < 1) {
			queue.remove(90);
			System.out.println(queue);
			break;
		}
	}

	}