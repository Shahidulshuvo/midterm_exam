package datastructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		// Creating a Queue
		Queue<String> javaQueue = new LinkedList<>();

		// Add data to queue
		javaQueue.add("Mercury");
		javaQueue.add("Venus");
		javaQueue.add("Earth");
		javaQueue.add("Mars");
		javaQueue.add("Jupiter");
		javaQueue.add("Saturn");
		javaQueue.add("Uranus");
		javaQueue.add("Neptune");

		// Demonstrate Queue operations
		System.out.println("Queue of planets in the solar system: " + javaQueue);
		System.out.println("Peek (get element at the front of the queue): " + javaQueue.peek());
		System.out.println("Remove (remove and return the element at the front): " + javaQueue.remove());
		System.out.println("Queue after removal: " + javaQueue);
		System.out.println("Poll (remove and return the element at the front): " + javaQueue.poll());
		System.out.println("Queue after poll: " + javaQueue);

		// Use for-each loop to retrieve data
		System.out.println("\nUsing for-each loop:");
		for (String planet : javaQueue) {
			System.out.println(planet);
		}

		// Use while loop with Iterator to retrieve data
		System.out.println("\nUsing while loop with Iterator:");
		Iterator<String> iterator = javaQueue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
