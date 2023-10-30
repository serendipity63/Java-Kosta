package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(100); // enqueue
		queue.offer(200); // enqueue
		System.out.println(queue.poll()); // dequeue
		System.out.println(queue.poll()); // dequeue
		System.out.println(queue.remove()); // dequeue
		queue.clear(); // 초기화

	}

}
