package stacksAndQueues;

public class Main {

	public static void transStackToQueue(Stack from, Queue to) {
		while (!from.isEmpty()) {
			String temp = from.pop().getData();
			to.enqueue(temp);
		}
	}

	public static void transQueueToStack(Queue from, Stack to) {
		while (!from.isEmpty()) {
			String temp = from.dequeue().getData();
			to.push(temp);

		}

	}

	public static void transStackToStack(Stack from, Stack to) {
		while (!from.isEmpty()) {
			String temp = from.pop().getData();
			to.push(temp);
		}
	}

	public static void main(String[] args) {

		Stack test = new Stack();
		Stack test2 = new Stack();

		 test.push("a");
		 test.push("b");
		 test.push("c");
		 test.push("d");
		 test.push("e");
		 transStackToStack(test, test2);
		 
		 test2.print();
//		Queue test1 = new Queue();
//
//		test1.enqueue("a");
//		test1.enqueue("b");
//		test1.enqueue("c");
//		test1.enqueue("d");
//		test1.enqueue("e");
//
//		transQueueToStack(test1, test);
//
//		test.pop().print();
//		test.pop().print();
//		test.pop().print();
//		test.pop().print();
//		test.pop().print();
//		System.out.println("");
//		test1.enqueue("a");
//		test1.enqueue("b");
//		test1.enqueue("c");
//		test1.enqueue("d");
//		test1.enqueue("e");
//
//		test1.dequeue().print();
//		test1.dequeue().print();
//		test1.dequeue().print();
//		test1.dequeue().print();
//		test1.dequeue().print();
	}

}
