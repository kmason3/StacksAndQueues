package stacksAndQueues;

public class Queue extends Stack {
	// Variables
	private Node front;
	private Node back;
	
	public Node peek() {
		return this.front;
	}

	/**
	 * returns true if queue is empty
	 */
	public boolean isEmpty() {
		return front == null && back == null;
	}

	/**
	 * Adds to queue
	 * 
	 * @param input
	 */
	public void enqueue(String input) {
		Node newNode = new Node(input);

		if (isEmpty()) {

			this.front = newNode;
			this.back = newNode;
		}

		else {
			this.back.setNext(newNode);
			this.back = newNode;
		}
	}

	/**
	 * Removes first item from queue
	 * 
	 * @return first item from queue
	 */
	public Node dequeue() {
		if (isEmpty()) {
			return null;
		}

		else {
			Node temp = front;
			this.front = front.getNext();
			return temp;
		}
	}

	/**
	 * Prints queue
	 */
	public void print() {

		if (isEmpty()) {
			System.out.println("Queue is Empty.");
		}

		else {
			Node temp = this.front;

			while (temp != null) {
				temp.print();
				temp = temp.getNext();
			}

			System.out.println("");
		}
	}

}
