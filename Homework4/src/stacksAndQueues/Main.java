package stacksAndQueues;

public class Main {

	/**
	 * Transfers data from a stack to a queue maintaining order when
	 * popped/dequeued
	 * 
	 * @param from
	 *            Stack
	 * @param to
	 *            Queue
	 */

	public static void transStackToQueue(Stack from, Queue to) {
		while (!from.isEmpty()) {
			String temp = from.pop().getData();
			to.enqueue(temp);
		}
	}

	/**
	 * Transfers data from a queue to a stack maintaining order when
	 * dequeued/popped
	 * 
	 * @param from
	 *            Queue
	 * @param to
	 *            Stack
	 */

	public static void transQueueToStack(Queue from, Stack to) {
		Stack tempStack = new Stack();
		while (!from.isEmpty()) {
			String temp = from.dequeue().getData();
			tempStack.push(temp);

		}
		while (!tempStack.isEmpty()) {
			String temp = tempStack.pop().getData();
			to.push(temp);
		}
		// reverseStack(tempStack, to);

	}

	/**
	 * Transfers data from a stack to another stack maintaining order when
	 * popped
	 * 
	 * @param from
	 *            Stack
	 * @param to
	 *            newStack
	 */

	public static void transStackToStack(Stack from, Stack to) {
		Stack tempStack = new Stack();
		while (!from.isEmpty()) {

			String tempString = from.pop().getData();
			tempStack.push(tempString);

		}
		while (!tempStack.isEmpty()) {
			String temp = tempStack.pop().getData();
			to.push(temp);
		}
		// reverseStack(tempStack, to);
	}

	/**
	 * Reverses order of stack to maintain popping order
	 * 
	 * @param from
	 *            Stack
	 * @param to
	 *            Stack
	 */
	
	public static void reverseStack(Stack from, Stack to) {
		while (!from.isEmpty()) {
			String temp = from.pop().getData();
			to.push(temp);
		}

	}

	public static void main(String[] args) {

		Stack test = new Stack();
		Queue test1 = new Queue();
		Stack test2 = new Stack();

		// StackToStack Test
		System.out.println("Stack to Stack Test:");
		System.out.println("");

		test.push("a");
		test.push("b");
		test.push("c");
		test.push("d");
		test.push("e");

		transStackToStack(test, test2);

		System.out.println("'To' Stack Pop:");
		System.out.println("");

		test2.pop().print();
		test2.pop().print();
		test2.pop().print();
		test2.pop().print();
		test2.pop().print();

		System.out.println("");

		test.push("a");
		test.push("b");
		test.push("c");
		test.push("d");
		test.push("e");

		System.out.println("'From' Stack Pop:");
		System.out.println("");

		test.pop().print();
		test.pop().print();
		test.pop().print();
		test.pop().print();
		test.pop().print();

		System.out.println("");

		// QueueToStack Test

		System.out.println("Queue To Stack Test:");
		System.out.println("");

		test1.enqueue("a");
		test1.enqueue("b");
		test1.enqueue("c");
		test1.enqueue("d");
		test1.enqueue("e");

		transQueueToStack(test1, test);

		System.out.println("'To' Stack Pop:");
		System.out.println("");

		test.pop().print();
		test.pop().print();
		test.pop().print();
		test.pop().print();
		test.pop().print();

		System.out.println("");

		test1.enqueue("a");
		test1.enqueue("b");
		test1.enqueue("c");
		test1.enqueue("d");
		test1.enqueue("e");

		System.out.println("'From' Queue Dequeue:");
		System.out.println("");

		test1.dequeue().print();
		test1.dequeue().print();
		test1.dequeue().print();
		test1.dequeue().print();
		test1.dequeue().print();

		System.out.println("");

		// StackToQueue Test

		System.out.println("Stack to Queue Test:");
		System.out.println("");

		test.push("a");
		test.push("b");
		test.push("c");
		test.push("d");
		test.push("e");

		transStackToQueue(test, test1);

		System.out.println("'To' Queue Dequeue:");
		System.out.println("");

		test1.dequeue().print();
		test1.dequeue().print();
		test1.dequeue().print();
		test1.dequeue().print();
		test1.dequeue().print();

		System.out.println("");

		test.push("a");
		test.push("b");
		test.push("c");
		test.push("d");
		test.push("e");

		System.out.println("'From' Stack Pop:");
		System.out.println("");

		test.pop().print();
		test.pop().print();
		test.pop().print();
		test.pop().print();
		test.pop().print();

	}

}
