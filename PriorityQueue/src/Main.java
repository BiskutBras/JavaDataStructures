import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// priority queue (interface)

//		Queue<Double> queue = new PriorityQueue<>();
		
//		reverse
//		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

//		queue.offer(3.0);
//		queue.offer(2.5);
//		queue.offer(4.0);
//		queue.offer(1.5);
//		queue.offer(2.0);
		
//		String
		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

		queue.offer("B");
		queue.offer("C");
		queue.offer("A");
		queue.offer("F");
		queue.offer("D");
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
